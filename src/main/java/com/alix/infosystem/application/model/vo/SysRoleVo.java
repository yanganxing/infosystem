package com.alix.infosystem.application.model.vo;

import com.alix.infosystem.common.frame.BaseVo;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/28 10:00
 * @since 1.8
 */
@Data
public class SysRoleVo extends BaseVo {
	private String roleName;
	private String createName;

}