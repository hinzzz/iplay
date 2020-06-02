package com.hinz.iplay.product.dao;

import com.hinz.iplay.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-02 16:15:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
