package com.alix.infosystem.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 17:15
 */
@RestController
@Api(tags = "登录")
public class LoginController {

    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public String login(String username, String password, boolean rememberMe, HttpServletResponse response){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        if(rememberMe){
            token.setRememberMe(true);
        }
        try {
            // 登录
            subject.login(token);
        } catch (UnknownAccountException uae) {
            // 用户名未知...
            return "用户不存在！";
        } catch (IncorrectCredentialsException ice) {
            // 凭据不正确，例如密码不正确 ...
            return "密码不正确！";
        } catch (LockedAccountException lae) {
            // 用户被锁定，例如管理员把某个用户禁用...
            return "用户被锁定！";
        } catch (ExcessiveAttemptsException eae) {
            // 尝试认证次数多余系统指定次数 ...
            return "尝试认证次数过多，请稍后重试！";
        } catch (AuthenticationException ae) {
            // 其他未指定异常
            return "未知异常！";
        }
        return "登录成功";
    }

    @ApiOperation(value = "登出")
    @GetMapping("/loginOut")
    public void loginOut(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }
}
