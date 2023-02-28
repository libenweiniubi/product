package com.calb.es.controller;

import com.calb.es.model.Result;
import com.calb.es.model.SysDept;
import com.calb.es.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * @author pandeng.li
 */
@Controller
@RequestMapping("/system/dept")
public class SysDeptController
{
    @Autowired
    private SysDeptService deptService;

    /**
     * 查询部门列表
     * @param dept
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public List<SysDept> selectDept(SysDept dept)
    {
        List<SysDept> deptList = deptService.selectDeptList(dept);
        return deptList;
    }

    /**
     * 新增部门
     */

    @PostMapping("/add")
    @ResponseBody
    public Result<SysDept> addDept(@RequestBody SysDept dept)
    {
        deptService.insertDept(dept);
        return Result.success(dept);
    }

    /**
     * 修改部门
     */

    @PostMapping("/edit/{deptId}")
    @ResponseBody
    public Result  edit(@PathVariable("deptId") Long deptId, @RequestBody SysDept dept)
    {
        deptService.updateDept(dept,deptId);
        return Result.success(dept);
    }


    /**
     * 删除
     */
    @PostMapping("/remove/{deptId}")
    @ResponseBody
    public Result remove(@PathVariable("deptId") Long deptId) {
        deptService.deleteDeptById(deptId);
        return Result.success(deptId);
    }
}
