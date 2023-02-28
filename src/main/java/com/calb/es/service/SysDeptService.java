package com.calb.es.service;

import com.calb.es.model.SysDept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门管理
 * @author pandeng.li
 */

public interface SysDeptService
{
    /**
     * 新增部门
     * @param dept
     * @return
     */
    public int insertDept(SysDept dept);

    /**
     * 根据ID删除部门
     * @param deptId
     * @return
     */
    public int deleteDeptById(Long deptId);

    /**
     * 编辑部门信息
     * @param dept
     * @param deptId
     * @return
     */
    public int updateDept(SysDept dept,Long deptId);

    /**
     * 查询部门列表
     * @param dept
     * @return
     */
    public List<SysDept> selectDeptList(SysDept dept);


}
