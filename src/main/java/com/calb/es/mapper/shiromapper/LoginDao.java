package com.calb.es.mapper.shiromapper;


import com.alibaba.fastjson.JSONObject;
import com.calb.es.shiro.session.SessionUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author: heeexy
 * @description: 登录相关dao
 * @date: 2017/10/24 11:02
 */
public interface LoginDao {
    /**
     * 根据用户名和密码查询对应的用户
     */
    SessionUserInfo  checkUser(@Param("username") String username, @Param("password") String password);

    List<SessionUserInfo> getUserInfo(String username);

    Set<String> getAllMenu(String username);

    Set<String> getAllPermissionCode(String username);
}
