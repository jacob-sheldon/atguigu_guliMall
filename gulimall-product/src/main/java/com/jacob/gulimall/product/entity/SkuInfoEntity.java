package com.jacob.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku??
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 14:43:29
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	private Long skuId;
	/**
	 * spuId
	 */
	private Long spuId;
	/**
	 * sku??
	 */
	private String skuName;
	/**
	 * sku????
	 */
	private String skuDesc;
	/**
	 * ????id
	 */
	private Long catalogId;
	/**
	 * ??id
	 */
	private Long brandId;
	/**
	 * ????
	 */
	private String skuDefaultImg;
	/**
	 * ??
	 */
	private String skuTitle;
	/**
	 * ???
	 */
	private String skuSubtitle;
	/**
	 * ??
	 */
	private BigDecimal price;
	/**
	 * ??
	 */
	private Long saleCount;

}
