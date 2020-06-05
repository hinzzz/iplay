package com.hinz.iplay.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 13:45:01
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

