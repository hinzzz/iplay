package com.hinz.iplay.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-02 16:15:11
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

