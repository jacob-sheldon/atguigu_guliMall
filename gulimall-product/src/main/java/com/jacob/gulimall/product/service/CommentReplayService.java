package com.jacob.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价表
 *
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 14:43:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

