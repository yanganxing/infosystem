package com.alix.infosystem.application.service;


import com.alix.infosystem.application.model.dto.SysUserDto;
import com.alix.infosystem.application.model.vo.SysUserVo;

import java.util.List;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:25
 * @since 1.8
 */
public interface ISysUserService{


    /**
     * 获取用户的名字
     * @param username 用户名
     * @return {@link SysUserVo}
     */
    SysUserVo getUserByName(String username);

    /**
     * 查询volist
     * @param sysUserDto 系统用户dto
     * @return {@link List<SysUserVo>}
     */
    List<SysUserVo> queryVOList(SysUserDto sysUserDto);

    /**
     * @param id id
     * @return {@link SysUserVo}
     */
    SysUserVo  loadById(String id);


    int save(SysUserDto userDto);
}
