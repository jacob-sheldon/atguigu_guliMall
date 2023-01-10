package com.jacob.gulimall.order.entity;

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
 * @date 2023-01-10 18:51:32
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ???(?????)
	 */
	private String orderSn;
	/**
	 * ??id
	 */
	private Long orderId;
	/**
	 * ????????
	 */
	private String alipayTradeNo;
	/**
	 * ?????
	 */
	private BigDecimal totalAmount;
	/**
	 * ????
	 */
	private String subject;
	/**
	 * ????
	 */
	private String paymentStatus;
	/**
	 * ????
	 */
	private Date createTime;
	/**
	 * ????
	 */
	private Date confirmTime;
	/**
	 * ????
	 */
	private String callbackContent;
	/**
	 * ????
	 */
	private Date callbackTime;

}
