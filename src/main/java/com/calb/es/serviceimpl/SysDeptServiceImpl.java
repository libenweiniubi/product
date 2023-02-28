package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysDeptMapper;
import com.calb.es.model.SysDept;
import com.calb.es.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门Service业务层处理
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysDeptServiceImpl implements SysDeptService
{
    @Autowired
    private SysDeptMapper sysDeptMapper;

    /**
     * 新增部门
     *
     * @param dept
     * @return
     */
    @Override
    public int insertDept(SysDept dept)
    {
        return sysDeptMapper.insertDept(dept);
    }

    /**
     * 根据ID删除部门
     *
     * @param deptId
     * @return
     */
    @Override
    public int deleteDeptById(Long deptId)
    {
        return sysDeptMapper.deleteDeptById(deptId);
    }

    /**
     * 编辑部门信息
     *
     * @param dept
     * @param deptId
     * @return
     */
    @Override
    public int updateDept(SysDept dept, Long deptId)
    {
        return sysDeptMapper.updateDept(dept,deptId);
    }

    /**
     * 查询部门列表
     *
     * @param dept
     * @return
     */
    @Override
    public List<SysDept> selectDeptList(SysDept dept)
    {
        return sysDeptMapper.selectDeptList(dept);
    }


}
