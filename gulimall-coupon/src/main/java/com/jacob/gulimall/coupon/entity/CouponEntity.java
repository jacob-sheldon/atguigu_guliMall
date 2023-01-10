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
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?????[0->????;1->????;2->????;3->????]
	 */
	private Integer couponType;
	/**
	 * ?????
	 */
	private String couponImg;
	/**
	 * ?????
	 */
	private String couponName;
	/**
	 * ??
	 */
	private Integer num;
	/**
	 * ??
	 */
	private BigDecimal amount;
	/**
	 * ??????
	 */
	private Integer perLimit;
	/**
	 * ????
	 */
	private BigDecimal minPoint;
	/**
	 * ????
	 */
	private Date startTime;
	/**
	 * ????
	 */
	private Date endTime;
	/**
	 * ????[0->????;1->????;2->????]
	 */
	private Integer useType;
	/**
	 * ??
	 */
	private String note;
	/**
	 * ????
	 */
	private Integer publishCount;
	/**
	 * ?????
	 */
	private Integer useCount;
	/**
	 * ????
	 */
	private Integer receiveCount;
	/**
	 * ?????????
	 */
	private Date enableStartTime;
	/**
	 * ?????????
	 */
	private Date enableEndTime;
	/**
	 * ???
	 */
	private String code;
	/**
	 * ?????????[0->????,??-????]
	 */
	private Integer memberLevel;
	/**
	 * ????[0-???,1-???]
	 */
	private Integer publish;

}
