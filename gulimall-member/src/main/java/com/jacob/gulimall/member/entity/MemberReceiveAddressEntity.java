package com.jacob.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收获地址表
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:39:09
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 收货人姓名
	 */
	private String name;
	/**
	 * 收货人手机号
	 */
	private String phone;
	/**
	 * 邮编
	 */
	private String postCode;
	/**
	 * 省份/城市
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 地区
	 */
	private String region;
	/**
	 * 详细地址
	 */
	private String detailAddress;
	/**
	 * 地区码
	 */
	private String areacode;
	/**
	 * 默认状态
	 */
	private Integer defaultStatus;

}
