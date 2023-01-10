package com.jacob.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员登记信息表
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:39:09
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

