package com.jacob.gulimall.order.entity;

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
 * @date 2023-01-10 18:51:32
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ??????????(?)
	 */
	private Integer flashOrderOvertime;
	/**
	 * ????????(?)
	 */
	private Integer normalOrderOvertime;
	/**
	 * ???????????(?)
	 */
	private Integer confirmOvertime;
	/**
	 * ????????,??????(?)
	 */
	private Integer finishOvertime;
	/**
	 * ???????????(?)
	 */
	private Integer commentOvertime;
	/**
	 * ?????0-??????,????;??-??????????
	 */
	private Integer memberLevel;

}
