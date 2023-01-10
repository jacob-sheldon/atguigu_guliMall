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
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????
	 */
	private String name;
	/**
	 * ????
	 */
	private String title;
	/**
	 * ?????
	 */
	private String subTitle;
	/**
	 * ????
	 */
	private Integer status;
	/**
	 * ????
	 */
	private String url;
	/**
	 * ??
	 */
	private Integer sort;
	/**
	 * ??????
	 */
	private String img;

}
