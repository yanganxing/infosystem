package com.alix.infosystem.application.model.vo;

import com.alix.infosystem.common.frame.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:45
 * @since 1.8
 */
@Data
public class SysUserVo extends BaseVo {

	@ApiModelProperty(value = "邮箱地址")
	private String email;

	@ApiModelProperty(value = "全名")
	private String fullName;

	@ApiModelProperty(value = "密码")
	private String password;

	@ApiModelProperty(value = "电话号码")
	private String phone;

	@ApiModelProperty(value = "用户名")
	private String userName;

	@ApiModelProperty(value = "角色")
	private Set<String> roles;

	@ApiModelProperty(value = "权限")
	private Set<String> permissions;
}