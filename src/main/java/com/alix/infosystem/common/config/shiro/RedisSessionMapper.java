package com.alix.infosystem.common.config.shiro;

import com.alix.infosystem.common.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 17:40
 */
@Component
@Slf4j
public class RedisSessionMapper extends AbstractSessionDAO {

    @Autowired
    private RedisUtil redisUtil;

    private final String PREFIX="TEST_SESSION";

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        log.info("当前sessionId为{}",sessionId);
        redisUtil.set(PREFIX+sessionId,sessionId,60000);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return null;
    }

    @Override
    public void update(Session session) throws UnknownSessionException {

    }

    @Override
    public void delete(Session session) {

    }

    @Override
    public Collection<Session> getActiveSessions() {
        return null;
    }
}
