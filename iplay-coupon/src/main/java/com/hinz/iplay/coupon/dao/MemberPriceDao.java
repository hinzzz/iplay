package com.hinz.iplay.coupon.dao;

import com.hinz.iplay.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:31:57
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
