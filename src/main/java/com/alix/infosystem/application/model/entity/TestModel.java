package com.alix.infosystem.application.model.entity;

import com.alix.infosystem.common.frame.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author 杨安星(Alix)
 * @create 2020-05-20 18:43
 */
@Data
@TableName("test")
public class TestModel extends BaseEntity{


    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

}
