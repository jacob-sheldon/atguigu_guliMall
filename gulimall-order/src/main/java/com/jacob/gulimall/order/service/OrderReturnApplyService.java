package com.jacob.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:51:32
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

