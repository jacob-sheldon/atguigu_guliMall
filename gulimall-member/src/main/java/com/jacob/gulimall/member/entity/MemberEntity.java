package com.jacob.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员表
 * 
 * @author jacob
 * @email jacobsheldon1991@gmail.com
 * @date 2023-01-10 18:39:09
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 会员id
	 */
	private Long levelId;
	/**
	 * 会员名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮件
	 */
	private String email;
	/**
	 * 头像
	 */
	private String header;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 生日
	 */
	private Date birth;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 工作
	 */
	private String job;
	/**
	 * 签名
	 */
	private String sign;
	/**
	 * 来源类型
	 */
	private Integer sourceType;
	/**
	 * 
	 */
	private Integer integration;
	/**
	 * 
	 */
	private Integer growth;
	/**
	 * 当前状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
