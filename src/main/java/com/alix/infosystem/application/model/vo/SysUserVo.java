package com.alix.infosystem.application.model.vo;

import com.alix.infosystem.common.frame.BaseVo;
import lombok.Data;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:45
 * @since 1.8
 */
@Data
public class SysUserVo extends BaseVo {
	private String createName;
	private String email;
	private String fullName;
	private String password;
	private String phone;
	private String userName;
}