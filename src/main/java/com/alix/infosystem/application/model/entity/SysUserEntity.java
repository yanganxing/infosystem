package com.alix.infosystem.application.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/30 18:28
 * @since 1.8
 */
@Data
@TableName("sys_user")
public class SysUserEntity {
	@TableField(value = "create_id")
	private Long createId;

	@TableField(value = "create_name")
	private String createName;

	@TableField(value = "create_time")
	private java.sql.Date createTime;

	@TableField(value = "del_flag")
	@TableLogic
	private Boolean delFlag;

	@TableField(value = "email")
	private String email;

	@TableField(value = "full_name")
	private String fullName;

	@TableField(value = "id")
	private Long id;

	@TableField(value = "password")
	private String password;

	@TableField(value = "phone")
	private String phone;

	@TableField(value = "update_by")
	private Long updateBy;

	@TableField(value = "update_by_name")
	private String updateByName;

	@TableField(value = "update_time")
	private java.sql.Date updateTime;

	@TableField(value = "username")
	private String username;

}