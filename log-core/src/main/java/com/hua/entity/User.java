/**
 * 描述: 
 * User.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.hua.bean.BaseBean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 描述: 
 * 
 * @author qye.zheng
 * User
 */
@Data
@EqualsAndHashCode(callSuper=false)
public final class User extends BaseBean {

	 /* long */
	private static final long serialVersionUID = 1L;
	
	/* 登录-用户名 (唯一) */
	private String username;
	
	/* 昵称 (用于显示) */
	private String nickname;
	
	/* 登录-密码 */
	private String password;
	
	/* 用户类型 */
	private UserType type;
	
	/* 用户状态 - 是否有效 默认 : 有效 */
	private boolean valid = true;
	
	/* 上一次登录-时间 */
	private LocalDateTime lastLoginTime;
	
	/* 上一次登录-IP地址 */
	private String lastLoginIp;
	
}
