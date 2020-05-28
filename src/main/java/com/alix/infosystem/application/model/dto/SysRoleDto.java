package com.alix.infosystem.application.model.dto;

import com.alix.infosystem.common.frame.BaseDto;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/28 10:00
 * @since 1.8
 */
@Data
public class SysRoleDto extends BaseDto {
	private String roleName;
	private String createName;
}