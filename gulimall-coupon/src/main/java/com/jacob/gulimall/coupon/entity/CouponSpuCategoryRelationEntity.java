package com.jacob.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ???id
	 */
	private Long couponId;
	/**
	 * ????id
	 */
	private Long categoryId;
	/**
	 * ??????
	 */
	private String categoryName;

}
