package com.jacob.gulimall.product.dao;

import com.jacob.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类表
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 14:43:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
