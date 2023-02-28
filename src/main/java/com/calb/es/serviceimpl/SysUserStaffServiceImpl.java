//package com.calb.es.serviceimpl;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.calb.hese.system.mapper.SysUserStaffMapper;
//import com.calb.hese.system.domain.SysUserStaff;
//import com.calb.hese.system.service.ISysUserStaffService;
//import com.ruoyi.common.core.text.Convert;
//
///**
// * 用户员工关联Service业务层处理
// *
// * @author lpd
// * @date 2022-08-29
// */
//@Service
//public class SysUserStaffServiceImpl implements SysUserStaffService
//{
//    @Autowired
//    private SysUserStaffMapper sysUserStaffMapper;
//
//    /**
//     * 查询用户员工关联
//     *
//     * @param userId 用户员工关联主键
//     * @return 用户员工关联
//     */
//    @Override
//    public SysUserStaff selectSysUserStaffByUserId(Long userId)
//    {
//        return sysUserStaffMapper.selectSysUserStaffByUserId(userId);
//    }
//
//    /**
//     * 查询用户员工关联列表
//     *
//     * @param sysUserStaff 用户员工关联
//     * @return 用户员工关联
//     */
//    @Override
//    public List<SysUserStaff> selectSysUserStaffList(SysUserStaff sysUserStaff)
//    {
//        return sysUserStaffMapper.selectSysUserStaffList(sysUserStaff);
//    }
//
//    /**
//     * 新增用户员工关联
//     *
//     * @param sysUserStaff 用户员工关联
//     * @return 结果
//     */
//    @Override
//    public int insertSysUserStaff(SysUserStaff sysUserStaff)
//    {
//        return sysUserStaffMapper.insertSysUserStaff(sysUserStaff);
//    }
//
//    /**
//     * 修改用户员工关联
//     *
//     * @param sysUserStaff 用户员工关联
//     * @return 结果
//     */
//    @Override
//    public int updateSysUserStaff(SysUserStaff sysUserStaff)
//    {
//        return sysUserStaffMapper.updateSysUserStaff(sysUserStaff);
//    }
//
//    /**
//     * 批量删除用户员工关联
//     *
//     * @param userIds 需要删除的用户员工关联主键
//     * @return 结果
//     */
//    @Override
//    public int deleteSysUserStaffByUserIds(String userIds)
//    {
//        return sysUserStaffMapper.deleteSysUserStaffByUserIds(Convert.toStrArray(userIds));
//    }
//
//    /**
//     * 删除用户员工关联信息
//     *
//     * @param userId 用户员工关联主键
//     * @return 结果
//     */
//    @Override
//    public int deleteSysUserStaffByUserId(Long userId)
//    {
//        return sysUserStaffMapper.deleteSysUserStaffByUserId(userId);
//    }
//}
