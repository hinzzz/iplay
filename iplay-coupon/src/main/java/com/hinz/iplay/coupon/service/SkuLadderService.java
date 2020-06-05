package com.hinz.iplay.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:31:56
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

