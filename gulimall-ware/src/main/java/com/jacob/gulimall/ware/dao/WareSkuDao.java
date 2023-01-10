package com.jacob.gulimall.ware.dao;

import com.jacob.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存表
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:55:08
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
