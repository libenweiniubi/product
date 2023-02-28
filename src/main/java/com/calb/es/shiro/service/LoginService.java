package com.calb.es.shiro.service;

import com.alibaba.fastjson.JSONObject;

import com.calb.es.mapper.shiromapper.LoginDao;
import com.calb.es.shiro.config.exception.CommonJsonException;
import com.calb.es.shiro.session.SessionUserInfo;
import com.calb.es.shiro.util.CommonUtil;
import com.calb.es.shiro.util.constants.ErrorEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: heeexy
 * @description: 登录service实现类
 * @date: 2017/10/24 11:53
 */
@Service
@Slf4j
public class LoginService {

    @Autowired
    private LoginDao loginDao;
    @Autowired
    private TokenService tokenService;

    /**
     * 登录表单提交
     */
    public JSONObject authLogin(JSONObject jsonObject)
    {
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        JSONObject info = new JSONObject();
        SessionUserInfo user = loginDao.checkUser(username, password);
        //查询登录的用户是非存在
        if (user == null)
        {
            throw new CommonJsonException(ErrorEnum.E_10010);
        }
        String token = tokenService.generateToken(username);
        info.put("token", token);
        System.out.println(info);
        return CommonUtil.successJson(info);
    }

    /**
     * 查询当前登录用户的权限等信息
     */
    public JSONObject getInfo(String token)
    {
        //从session获取用户信息
        SessionUserInfo userInfo = tokenService.getUserInfoFromCache(token);
        log.info(userInfo.toString());
        return CommonUtil.successJson(userInfo);
    }

    /**
     * 退出登录
     */
    public JSONObject logout() {
        tokenService.invalidateToken();
        return CommonUtil.successJson();
    }
}
