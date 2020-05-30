package com.alix.infosystem.application.service.impl;


import com.alix.infosystem.application.mapper.SysUserMapper;
import com.alix.infosystem.application.model.dto.SysUserDto;
import com.alix.infosystem.application.model.entity.SysUserEntity;
import com.alix.infosystem.application.model.vo.SysUserVo;
import com.alix.infosystem.application.service.ISysUserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        //添加权限信息和角色信息
        return sysUserMapper.getUserByName(username);
    }

    @Override
    public List<SysUserVo> queryVOList(SysUserDto sysUserDto) {
        List<SysUserEntity> list = sysUserMapper.selectList(null);
        List<SysUserVo> result = new ArrayList<>();
        SysUserVo sysUserVo;
        for(SysUserEntity  entity : list){
            sysUserVo = new SysUserVo();
            BeanUtils.copyProperties(entity,sysUserVo);
            result.add(sysUserVo);
        }
        return result;
    }

    @Override
    public SysUserVo loadById(String id) {
        SysUserEntity sysUserEntity = sysUserMapper.selectById(id);
        SysUserVo sysUserVo = new SysUserVo();
        BeanUtils.copyProperties(sysUserEntity,sysUserVo);
        return sysUserVo;
    }

    @Override
    public int save(SysUserDto userDto) {
        return 0;
    }
}
