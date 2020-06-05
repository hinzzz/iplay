package com.hinz.iplay.coupon.dao;

import com.hinz.iplay.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:31:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
