package com.alix.infosystem.application.service.impl;


import com.alix.infosystem.application.mapper.SysUserMapper;
import com.alix.infosystem.application.model.vo.SysUserVo;
import com.alix.infosystem.application.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:34
 * @since 1.8
 */
@Service
public class SysUserServiceImpl implements ISysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserVo getUserByName(String username) {
        //添加权限信息和橘色信息

        return sysUserMapper.getUserByName(username);
    }
}
