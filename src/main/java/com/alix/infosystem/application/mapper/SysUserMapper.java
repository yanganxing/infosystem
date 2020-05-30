package com.alix.infosystem.application.mapper;

import com.alix.infosystem.application.model.entity.SysUserEntity;
import com.alix.infosystem.application.model.vo.SysUserVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Alix(杨安星)
 * @version 1.0
 * @date 2020/05/26 16:37
 * @since 1.8
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {


    /**
     * 获取用户的名字
     * @param username 用户名
     * @return {@link SysUserVo}
     */
    SysUserVo getUserByName(String username);

}
