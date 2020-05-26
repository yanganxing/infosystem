package com.alix.infosystem.common.frame;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Anxing.Yang
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField(value = "id")
    private Long id;

    @TableField(value = "create_id")
    private String createId;

    @TableField(value = "create_name")
    private String createName;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_by")
    private String updateBy;

    @TableField(value = "update_by_name")
    private String updateByName;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "del_flag")
    private Integer delFlag;

}
