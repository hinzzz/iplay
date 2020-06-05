package com.hinz.iplay.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hinz.common.utils.PageUtils;
import com.hinz.iplay.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:35:37
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

