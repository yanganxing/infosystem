package com.alix.infosystem.application.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/30 18:28
 * @since 1.8
 */
@Data
public class SysUserVo{
	@ApiModelProperty(value = "创建人ID" )
	private Long createId;
	
	@ApiModelProperty(value = "创建人姓名" )
	private String createName;
	
	@ApiModelProperty(value = "创建时间" )
	private java.sql.Date createTime;
	
	@ApiModelProperty(value = "逻辑删除 0-删除 1-正常" )
	private Boolean delFlag;
	
	@ApiModelProperty(value = "邮箱地址" )
	private String email;
	
	@ApiModelProperty(value = "全名" )
	private String fullName;
	
	@ApiModelProperty(value = "主键" )
	private Long id;
	
	@ApiModelProperty(value = "密码" )
	private String password;
	
	@ApiModelProperty(value = "手机号码" )
	private String phone;
	
	@ApiModelProperty(value = "更新人ID" )
	private Long updateBy;
	
	@ApiModelProperty(value = "更新人姓名" )
	private String updateByName;
	
	@ApiModelProperty(value = "更新时间" )
	private java.sql.Date updateTime;
	
	@ApiModelProperty(value = "用户名" )
	private String username;

	private Set<String> roles;

	private Set<String> permissions;
}