package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysUserMapper;
import com.calb.es.model.SysUser;
import com.calb.es.service.SysUserService;
import com.calb.es.utils.DateUtils;
import com.calb.es.utils.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 用户信息Service业务层处理
 *
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysUserServiceImpl implements SysUserService
{
    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询用户信息
     *
     * @param userId 用户信息主键
     * @return 用户信息
     */
    @Override
    public SysUser selectSysUserByUserId(Long userId)
    {
        return sysUserMapper.selectUserById(userId);
    }

    /**
     * 查询用户信息列表
     *
     * @param sysUser 用户信息
     * @return 用户信息
     */
    @Override
    public List<SysUser> selectSysUserList(SysUser sysUser)
    {
        return sysUserMapper.selectUserList(sysUser);
    }

    /**
     * 新增用户信息
     *
     * @param sysUser 用户信息
     * @return 结果
     */
    @Override
    public boolean insertSysUser(SysUser sysUser)
    {
        sysUser.setCreateTime(DateUtils.getNowDate());
        return sysUserMapper.insertUser(sysUser);
    }

    /**
     * 修改用户信息
     *
     * @param sysUser 用户信息
     * @return 结果
     */
    @Override
    public int updateSysUser(SysUser sysUser)
    {
        sysUser.setUpdateTime(DateUtils.getNowDate());
        return sysUserMapper.updateUser(sysUser);
    }

    /**
     * 批量删除用户信息
     *
     * @param userIds 需要删除的用户信息主键
     * @return 结果
     */
//    @Override
//    public int deleteSysUserByUserIds(String userId)
//    {
//        return sysUserMapper.deleteUserByIds(userId);
//    }

    /**
     * 删除用户信息信息
     *
     * @param userId 用户信息主键
     * @return 结果
     */
    @Override
    public int deleteSysUserByUserId(Long userId)
    {
        return sysUserMapper.deleteUserById(userId);
    }

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public SysUser selectUserByLoginName(String userName)
    {
        return sysUserMapper.selectUserByLoginName(userName);
    }
}
