package com.hinz.iplay.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 13:45:01
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

