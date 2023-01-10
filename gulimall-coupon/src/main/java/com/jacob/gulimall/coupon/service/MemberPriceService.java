package com.jacob.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:33:39
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

