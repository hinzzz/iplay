package com.hinz.iplay.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:24:53
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

