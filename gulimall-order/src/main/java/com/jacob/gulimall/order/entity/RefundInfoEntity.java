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
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?????
	 */
	private Long orderReturnId;
	/**
	 * ????
	 */
	private BigDecimal refund;
	/**
	 * ???????
	 */
	private String refundSn;
	/**
	 * ????
	 */
	private Integer refundStatus;
	/**
	 * ????[1-???,2-??,3-??,4-??]
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
