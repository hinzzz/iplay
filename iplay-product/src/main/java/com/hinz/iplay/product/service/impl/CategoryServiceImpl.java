package com.hinz.iplay.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hinz.common.utils.PageUtils;
import com.hinz.common.utils.Query;

import com.hinz.iplay.product.dao.CategoryDao;
import com.hinz.iplay.product.entity.CategoryEntity;
import com.hinz.iplay.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> listTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> result = entities.stream().filter(entity ->
                entity.getParentCid() == 0
        ).map(menu -> {
            menu.setChildrens(getChildrens(menu, entities));
            return menu;
        }).sorted((m1, m2) -> {
            return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort());
        }).collect(Collectors.toList());
        return result;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> entities) {
        List<CategoryEntity> childrens = entities.stream().filter(entity -> entity.getParentCid() == root.getCatId())
                .map(menu -> {
                    menu.setChildrens(getChildrens(menu, entities));
                    return menu;
                }).sorted((m1, m2) -> {
                    return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort());
                }).collect(Collectors.toList());
        return childrens;
    }
}