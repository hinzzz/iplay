package com.hinz.iplay.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-02 16:15:10
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listTree();
}

