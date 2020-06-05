package com.hinz.iplay.member.dao;

import com.hinz.iplay.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hinzzz
 * @email 157957329@qq.com
 * @date 2020-06-04 11:35:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
