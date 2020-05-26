package com.alix.infosystem.common.frame;

import lombok.Data;

import java.util.Date;

/**
 * @author Anxing.Yang
 */
@Data
public class BaseDto {

    protected Long id;

    protected String createId;

    protected String createName;

    protected Date createTime;

    protected String updateBy;

    protected String updateByName;

    protected Date updateTime;

    protected Integer delFlag;
}
