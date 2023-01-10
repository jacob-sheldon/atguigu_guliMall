package com.jacob.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:55:09
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

