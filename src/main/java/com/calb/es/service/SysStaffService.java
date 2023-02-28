package com.calb.es.service;

import com.calb.es.model.SysStaff;
import java.util.List;

/**
 * 员工信息Service接口
 *
 * @author lpd
 * @date 2022-08-29
 */
public interface SysStaffService
{
    /**
     * 查询员工信息
     *
     * @param userId 员工信息主键
     * @return 员工信息
     */
    public SysStaff selectSysStaffByUserId(Long userId);

    /**
     * 查询员工信息列表
     *
     * @param sysStaff 员工信息
     * @return 员工信息集合
     */
    public List<SysStaff> selectSysStaffList(SysStaff sysStaff);

    /**
     * 新增员工信息
     *
     * @param sysStaff 员工信息
     * @return 结果
     */
    public int insertSysStaff(SysStaff sysStaff);

    /**
     * 修改员工信息
     *
     * @param sysStaff 员工信息
     * @return 结果
     */
    public int updateSysStaff(SysStaff sysStaff);



    /**
     * 删除员工信息信息
     *
     * @param userId 员工信息主键
     * @return 结果
     */
    public int deleteSysStaffByUserId(Long userId);
}
