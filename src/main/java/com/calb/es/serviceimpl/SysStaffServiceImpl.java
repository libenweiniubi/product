package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysStaffMapper;
import com.calb.es.model.SysStaff;
import com.calb.es.service.SysStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工信息Service业务层处理
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysStaffServiceImpl implements SysStaffService
{
    @Autowired
    private SysStaffMapper sysStaffMapper;

    /**
     * 查询员工信息
     * 
     * @param userId 员工信息主键
     * @return 员工信息
     */
    @Override
    public SysStaff selectSysStaffByUserId(Long userId)
    {
        return sysStaffMapper.selectSysStaffByUserId(userId);
    }

    /**
     * 查询员工信息列表
     * 
     * @param sysStaff 员工信息
     * @return 员工信息
     */
    @Override
    public List<SysStaff> selectSysStaffList(SysStaff sysStaff)
    {
        return sysStaffMapper.selectSysStaffList(sysStaff);
    }

    /**
     * 新增员工信息
     * 
     * @param sysStaff 员工信息
     * @return 结果
     */
    @Override
    public int insertSysStaff(SysStaff sysStaff)
    {
        return sysStaffMapper.insertSysStaff(sysStaff);
    }

    /**
     * 修改员工信息
     * 
     * @param sysStaff 员工信息
     * @return 结果
     */
    @Override
    public int updateSysStaff(SysStaff sysStaff)
    {
        return sysStaffMapper.updateSysStaff(sysStaff);
    }


    /**
     * 删除员工信息信息
     * 
     * @param userId 员工信息主键
     * @return 结果
     */
    @Override
    public int deleteSysStaffByUserId(Long userId)
    {
        return sysStaffMapper.deleteSysStaffByUserId(userId);
    }
}
