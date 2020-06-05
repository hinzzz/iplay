package com.hinz.iplay.order.dao;

import com.hinz.iplay.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:24:52
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
