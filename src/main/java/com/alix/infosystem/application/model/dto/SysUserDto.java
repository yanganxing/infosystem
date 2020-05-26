package com.alix.infosystem.application.model.dto;

import com.alix.infosystem.common.frame.BaseDto;
import lombok.Data;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:40
 * @since 1.8
 */
@Data
public class SysUserDto extends BaseDto {
	private String createName;
	private String email;
	private String fullName;
	private String password;
	private String phone;
	private String userName;
}