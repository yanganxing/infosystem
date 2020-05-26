package com.alix.infosystem.application.model.dto;

import com.alix.infosystem.common.frame.BaseDto;
import lombok.Data;

import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/25 23:22
 * @since 1.8
 */
@Data
public class TestDto   {

	private Long id;
	private String createId;
	private String createName;
	private Date createTime;
	private String updateBy;
	private String updateByName;
	private Date updateTime;
	private Integer delFlag;
	private String password;
	private String username;
}