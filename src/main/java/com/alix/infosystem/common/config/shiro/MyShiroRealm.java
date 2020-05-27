package com.alix.infosystem.common.config.shiro;

import com.alix.infosystem.application.model.vo.SysUserVo;
import com.alix.infosystem.application.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 16:57
 */
@Slf4j
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private ISysUserService userService;

    /**
     * 权限处理
     * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


    /**
     * 身份验证
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("身份验证开始");
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        SysUserVo sysUserVo = userService.getUserByName(username);

        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo();
        return authenticationInfo;
    }

}
