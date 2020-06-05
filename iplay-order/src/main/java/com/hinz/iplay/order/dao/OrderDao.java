package com.hinz.iplay.order.dao;

import com.hinz.iplay.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:24:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
