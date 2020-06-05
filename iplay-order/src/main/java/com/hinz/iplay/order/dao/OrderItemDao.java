package com.hinz.iplay.order.dao;

import com.hinz.iplay.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:24:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
