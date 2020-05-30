package com.alix.infosystem.application.controller;

import com.alix.infosystem.application.model.vo.SysUserVo;
import com.alix.infosystem.application.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:25
 * @since 1.8
 */
@RestController
@RequestMapping("sysUser")
@Api(tags = "用户管理")
public class RestSysUserController {

    @Autowired
    private ISysUserService userService;

    @GetMapping("/loadById")
    @ApiOperation(value = "根据id实体信息")
    public SysUserVo loadById(String id){
        return userService.loadById(id);
    }

    @PostMapping("list")
    @ApiOperation(value = "条件查询")
    public List<SysUserVo> queryVoListByCondition(){
        return userService.queryVOList(null);
    }
}
