package com.alix.infosystem.application.model.entity;

import com.alix.infosystem.common.frame.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/28 10:09
 * @since 1.8
 */
@Data
@TableName("sys_permission")
public class SysPermissionEntity extends BaseEntity {
	@TableField(value = "parent_id")
	private String parentId;
	@TableField(value = "res_name")
	private String resName;
	@TableField(value = "res_type")
	private String resType;
	@TableField(value = "permission")
	private String permission;
	@TableField(value = "url")
	private String url;
	@TableField(value = "create_name")
	private String createName;
}