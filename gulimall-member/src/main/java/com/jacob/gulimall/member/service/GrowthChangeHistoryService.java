package com.jacob.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:39:09
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

