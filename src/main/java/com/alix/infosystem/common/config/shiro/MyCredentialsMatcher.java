package com.alix.infosystem.common.config.shiro;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 17:40
 */
@Slf4j
public class MyCredentialsMatcher extends HashedCredentialsMatcher {
    /**
     * 重写密码验证器
     *
     * @param token 用户输入的信息
     * @param info  数据库查询到的信息
     */
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken upt = (UsernamePasswordToken) token;
        // 用户输入的用户名
        String inputName = upt.getUsername();
        // 用户输入的密码
        String inputPwd = new String(upt.getPassword());
        // 数据库查询得到的加密后的密码
        String dbPassword = (String) info.getCredentials();
        // 对用户输入密码进行加密(加密方式,用户输入密码,盐值（用户名）,加密次数)
        // 加密后的密码
        String encryptionPwd = new SimpleHash("MD5", inputPwd, inputName, 1024).toString();
        return equals(encryptionPwd, dbPassword);
    }

    @Test
    public void f(){
        log.info(new SimpleHash("MD5", "123456", "yanganxing", 1024).toString());
    }

}
