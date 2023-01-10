package com.jacob.gulimall.member.dao;

import com.jacob.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登记信息表
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:39:09
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
