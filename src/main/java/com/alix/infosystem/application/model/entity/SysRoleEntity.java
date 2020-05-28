package com.alix.infosystem.application.model.entity;

import com.alix.infosystem.common.frame.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/28 10:00
 * @since 1.8
 */
@Data
@TableName("sys_role")
public class SysRoleEntity extends BaseEntity {
	@TableField(value = "role_name")
	private String roleName;
	@TableField(value = "create_name")
	private String createName;
}