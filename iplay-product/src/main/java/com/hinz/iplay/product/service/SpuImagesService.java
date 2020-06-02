package com.hinz.iplay.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-02 16:15:10
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

