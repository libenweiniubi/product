package com.calb.es.shiro.service;

import com.github.benmanes.caffeine.cache.Cache;
import com.calb.es.shiro.config.exception.CommonJsonException;
import com.calb.es.mapper.shiromapper.LoginDao;
import com.calb.es.shiro.session.SessionUserInfo;
import com.calb.es.shiro.util.StringTools;
import com.calb.es.shiro.util.constants.ErrorEnum;
import lombok.extern.slf4j.Slf4j;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

@Service
@Slf4j
public class TokenService {

    @Autowired
    Cache<String, SessionUserInfo> cacheMap;

    @Autowired
    LoginDao loginDao;

    /**
     * 用户登录验证通过后(sso/帐密),生成token,记录用户已登录的状态
     */
    public String generateToken(String username)
    {
        MDC.put("username", username);
        String token = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
        MDC.put("token",token);

        String token1 =MDC.get("token");
        System.out.println("token:"+token1);
        String name = MDC.get("username");
        System.out.println("name:"+name);
        //设置用户信息缓存
        setCache(token, username);

        return token;

    }

    /**
     * 获取用户权限
     * @return
     */
    public SessionUserInfo getUserInfo()
    {
        String token = MDC.get("token");
        System.out.println("token:"+token);
        return getUserInfoFromCache(token);
    }

    /**
     * 从缓存中查询用户的登录信息
     * 根据token查询用户信息
     * 如果token无效,会抛未登录的异常
     */
    public SessionUserInfo getUserInfoFromCache(String token)
    {
        if (StringTools.isNullOrEmpty(token))
        {
            throw new CommonJsonException(ErrorEnum.E_20011);
        }
        log.debug("根据token从缓存中查询用户信息,{}", token);
        SessionUserInfo info = cacheMap.getIfPresent(token);
        System.out.println("info:"+info);
        if (info == null)
        {
            log.info("没拿到缓存 token={}", token);
            throw new CommonJsonException(ErrorEnum.E_20011);
        }
        return info;
    }

    //设置用户缓存
    private void setCache(String token, String username)
    {
        SessionUserInfo info = getUserInfoByUsername(username,token);
        log.info("设置用户信息缓存:token={} , username={}, info={}", token, username, info);
        cacheMap.put(token, info);
    }

    /**
     * 退出登录时,将token置为无效
     */
    public void invalidateToken()
    {
        String token = MDC.get("token");
        if (!StringTools.isNullOrEmpty(token))
        {
            cacheMap.invalidate(token);
        }
        log.debug("退出登录,清除缓存:token={}", token);
    }

    /**
     * 通过用户名查询用户的权限
     * @param username
     * @return
     */
    private SessionUserInfo getUserInfoByUsername(String username,String token)
    {
        List<SessionUserInfo> list = loginDao.getUserInfo(username);
        SessionUserInfo userInfo = list.get(0);
        userInfo.setToken(token);
        //管理员,查出全部按钮和权限码
        userInfo.setMenuList(loginDao.getAllMenu(username));
        userInfo.setPermissionList(loginDao.getAllPermissionCode(username));
        System.out.println("============================================");
        System.out.println(userInfo);
        return userInfo;
    }
}
