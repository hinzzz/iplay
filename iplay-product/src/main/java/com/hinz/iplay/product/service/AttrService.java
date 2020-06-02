package com.hinz.iplay.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-02 16:15:12
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

