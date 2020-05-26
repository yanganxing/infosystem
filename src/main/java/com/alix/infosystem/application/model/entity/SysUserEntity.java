package com.alix.infosystem.application.model.entity;

import com.alix.infosystem.common.frame.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:40
 * @since 1.8
 */
@Data
@TableName("sys_user")
public class SysUserEntity extends BaseEntity {
	@TableField(value = "create_name")
	private String createName;
	@TableField(value = "email")
	private String email;
	@TableField(value = "full_name")
	private String fullName;
	@TableField(value = "password")
	private String password;
	@TableField(value = "phone")
	private String phone;
	@TableField(value = "user_name")
	private String userName;
}