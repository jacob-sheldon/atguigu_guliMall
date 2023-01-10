package com.jacob.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu???
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 14:43:29
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ??id
	 */
	private Long spuId;
	/**
	 * ??id
	 */
	private Long attrId;
	/**
	 * ???
	 */
	private String attrName;
	/**
	 * ???
	 */
	private String attrValue;
	/**
	 * ??
	 */
	private Integer attrSort;
	/**
	 * ?????????????;0-? 1-??
	 */
	private Integer quickShow;

}
