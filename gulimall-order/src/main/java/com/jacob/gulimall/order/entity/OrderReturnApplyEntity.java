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
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * ????id
	 */
	private Long skuId;
	/**
	 * ????
	 */
	private String orderSn;
	/**
	 * ????
	 */
	private Date createTime;
	/**
	 * ?????
	 */
	private String memberUsername;
	/**
	 * ????
	 */
	private BigDecimal returnAmount;
	/**
	 * ?????
	 */
	private String returnName;
	/**
	 * ?????
	 */
	private String returnPhone;
	/**
	 * ????[0->???;1->???;2->???;3->???]
	 */
	private Integer status;
	/**
	 * ????
	 */
	private Date handleTime;
	/**
	 * ????
	 */
	private String skuImg;
	/**
	 * ????
	 */
	private String skuName;
	/**
	 * ????
	 */
	private String skuBrand;
	/**
	 * ??????(JSON)
	 */
	private String skuAttrsVals;
	/**
	 * ????
	 */
	private Integer skuCount;
	/**
	 * ????
	 */
	private BigDecimal skuPrice;
	/**
	 * ????????
	 */
	private BigDecimal skuRealPrice;
	/**
	 * ??
	 */
	private String reason;
	/**
	 * ??
	 */
	private String description;
	/**
	 * ????,?????
	 */
	private String descPics;
	/**
	 * ????
	 */
	private String handleNote;
	/**
	 * ????
	 */
	private String handleMan;
	/**
	 * ???
	 */
	private String receiveMan;
	/**
	 * ????
	 */
	private Date receiveTime;
	/**
	 * ????
	 */
	private String receiveNote;
	/**
	 * ????
	 */
	private String receivePhone;
	/**
	 * ??????
	 */
	private String companyAddress;

}
