package com.alix.infosystem.common.config.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.rmi.runtime.Log;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 17:38
 */
@Configuration
@Slf4j
public class ShiroConfig {
    // remeberMe cookie 加密的密钥 各个项目不一样 默认AES算法 密钥长度（128 256 512）
    private static final String ENCRYPTION_KEY = "3AvVhmFLUs0KTA3Kprsdag==";


    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 拦截器
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        // 配置不会被拦截的链接 顺序判断
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilterFactoryBean;
    }

    /**
     * 自定义身份认证 realm;
     * <p>
     * 必须写这个类，并加上 @Bean 注解，目的是注入 MyShiroRealm， 否则会影响 MyShiroRealm类 中其他类的依赖注入
     */
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        // 设置密码比较器
        myShiroRealm.setCredentialsMatcher(CredentialsMatcher());
//        // 启用身份验证缓存，即缓存AuthenticationInfo信息，默认false
//        myShiroRealm.setAuthenticationCachingEnabled(true);
//        // 启用授权缓存，即缓存AuthorizationInfo信息，默认false,一旦配置了缓存管理器，授权缓存默认开启
//        myShiroRealm.setAuthorizationCachingEnabled(true);

        return myShiroRealm;
    }

    @Bean
    public SimpleCredentialsMatcher CredentialsMatcher() {
        //自定义凭证比较器
        MyCredentialsMatcher hct = new MyCredentialsMatcher();
        // 加密算法的名称
        hct.setHashAlgorithmName("MD5");
        // 配置加密的次数
        hct.setHashIterations(1024);
        // 是否存储为16进制
        hct.setStoredCredentialsHexEncoded(true);
        return hct;
    }

    public static void main(String[] args) {
       String s =  new SimpleHash("MD5", "123", "yanganxing", 1024).toString();
        log.info(s);
    }


    /**
     * 注入 securityManager
     */
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //配置自定义权限认证器
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }



}
