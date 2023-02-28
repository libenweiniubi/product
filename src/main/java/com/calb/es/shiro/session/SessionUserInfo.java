package com.calb.es.shiro.session;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 保存在session中的用户信息
 * @author pandeng.li
 */
@Data
public class SessionUserInfo
{
    private int userId;
    private String username;
    private String nickname;
    private List<Integer> roleIds;
    private Set<String> menuList;
    private Set<String> permissionList;
    public String token;
}
