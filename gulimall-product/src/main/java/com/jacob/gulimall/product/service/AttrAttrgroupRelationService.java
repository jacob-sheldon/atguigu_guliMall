package com.jacob.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 14:43:29
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

