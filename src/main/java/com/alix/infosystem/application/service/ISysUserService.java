package com.alix.infosystem.application.service;


import com.alix.infosystem.application.model.vo.SysUserVo;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:25
 * @since 1.8
 */
public interface ISysUserService{

    /**
     * 根据用户名查询用户信息
     * */
    SysUserVo getUserByName(String username);
}
