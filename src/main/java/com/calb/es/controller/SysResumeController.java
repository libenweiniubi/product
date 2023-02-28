package com.calb.es.controller;

import java.util.List;

import com.calb.es.model.Result;
import com.calb.es.model.SysResume;
import com.calb.es.service.SysResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


/**
 * 简历库Controller
 *
 * @author lpd
 * @date 2022-08-29
 */
@Controller
@RequestMapping("/system/resume")
public class SysResumeController
{
    @Autowired
    private SysResumeService sysResumeService;

    /**
     * 查询简历库列表
     */
    @GetMapping("/list")
    @ResponseBody
    public List selectSysResumeList (SysResume sysResume)
    {
        List<SysResume> list = sysResumeService.selectResumeList(sysResume);
        return list;
    }

    /**
     * 新增简历
     */
    @PostMapping("/add")
    @ResponseBody
    public Result addSave(@RequestBody SysResume sysResume)
    {
        sysResumeService.insertResume(sysResume);
        return Result.success(sysResume);
    }

    /**
     * 修改简历
     */
    @PostMapping("/edit/{resumeId}")
    @ResponseBody
    public Result edit(@PathVariable("resumeId") Long resumeId, @RequestBody SysResume sysResume)
    {
        sysResumeService.updateResume(sysResume,resumeId);
        return Result.success(resumeId);
    }

    /**
     * 删除简历
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long id)
    {
        sysResumeService.deleteResume(id);
        return Result.success(id);
    }
}
