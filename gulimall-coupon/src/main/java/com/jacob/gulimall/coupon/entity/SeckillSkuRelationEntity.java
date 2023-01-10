package com.jacob.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:33:39
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ??id
	 */
	private Long promotionId;
	/**
	 * ????id
	 */
	private Long promotionSessionId;
	/**
	 * ??id
	 */
	private Long skuId;
	/**
	 * ????
	 */
	private BigDecimal seckillPrice;
	/**
	 * ????
	 */
	private BigDecimal seckillCount;
	/**
	 * ??????
	 */
	private BigDecimal seckillLimit;
	/**
	 * ??
	 */
	private Integer seckillSort;

}
