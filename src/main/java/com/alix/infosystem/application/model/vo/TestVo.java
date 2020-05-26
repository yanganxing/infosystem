package com.alix.infosystem.application.model.vo;

import com.alix.infosystem.common.frame.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/25 23:22
 * @since 1.8
 */
@Data
public class TestVo extends BaseVo {

	@ApiModelProperty(value = "用户名")
	private String username;

	@ApiModelProperty(value = "密码")
	private String password;

}