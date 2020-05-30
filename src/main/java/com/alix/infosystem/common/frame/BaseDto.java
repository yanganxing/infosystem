package com.alix.infosystem.common.frame;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author Anxing.Yang
 */
@Data
public class BaseDto {

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
