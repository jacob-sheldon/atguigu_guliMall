package com.jacob.gulimall.product.entity;

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
 * @date 2023-01-10 14:43:29
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ??id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ??
	 */
	private String attrGroupName;
	/**
	 * ??
	 */
	private Integer sort;
	/**
	 * ??
	 */
	private String descript;
	/**
	 * ???
	 */
	private String icon;
	/**
	 * ????id
	 */
	private Long catelogId;

}
