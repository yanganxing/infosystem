package com.alix.infosystem.application.model.vo;

import com.alix.infosystem.common.frame.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/28 10:09
 * @since 1.8
 */
@Data
public class SysPermissionVo{
	private String parentId;
	private String resName;
	private String resType;
	private String permission;
	private String url;

	@ApiModelProperty(value = "主键")
	protected Long id;

	@ApiModelProperty(value = "创建人ID")
	protected String createId;

	@ApiModelProperty(value = "创建人姓名")
	protected String createName;

	@ApiModelProperty(value = "创建时间")
	protected Date createTime;

	@ApiModelProperty(value = "修改人ID")
	protected String updateBy;

	@ApiModelProperty(value = "修改人姓名")
	protected String updateByName;

	@ApiModelProperty(value = "更新时间")
	protected Date updateTime;

	@ApiModelProperty(value = "删除标识")
	protected Integer delFlag;
}