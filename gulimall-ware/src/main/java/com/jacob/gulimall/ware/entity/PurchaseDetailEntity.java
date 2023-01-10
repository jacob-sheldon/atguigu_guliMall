package com.jacob.gulimall.ware.entity;

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
 * @date 2023-01-10 18:55:09
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * ???id
	 */
	private Long purchaseId;
	/**
	 * ????id
	 */
	private Long skuId;
	/**
	 * ????
	 */
	private Integer skuNum;
	/**
	 * ????
	 */
	private BigDecimal skuPrice;
	/**
	 * ??id
	 */
	private Long wareId;
	/**
	 * ??[0??,1???,2????,3???,4????]
	 */
	private Integer status;

}
