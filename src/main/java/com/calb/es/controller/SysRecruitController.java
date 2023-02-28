package com.calb.es.controller;


import com.calb.es.model.Result;
import com.calb.es.model.SysRecruit;
import com.calb.es.service.SysRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 招聘信息Controller
 *
 * @author lpd
 * @date 2022-08-29
 */
@Controller
@RequestMapping("/system/recruit")
public class SysRecruitController
{

    @Autowired
    private SysRecruitService sysRecruitService;

    /**
     * 查询招聘信息列表
     */
    @GetMapping("/list")
    @ResponseBody
    public List<SysRecruit> selectSysRecruitList(SysRecruit sysRecruit)
    {
        List<SysRecruit> list = sysRecruitService.selectRecruitList(sysRecruit);
        return list;
    }

    /**
     * 新增招聘信息
     */

    @PostMapping("/add")
    @ResponseBody
    public Result addSave(@RequestBody SysRecruit sysRecruit)
    {
        sysRecruitService.insertRecruit(sysRecruit);
        return Result.success(sysRecruit);
    }

    /**
     * 修改招聘信息
     */
    @GetMapping("/edit/{recruitId}")
    public Result<Long> edit(@PathVariable("recruitId") Long recruitId, @RequestBody SysRecruit sysRecruit)
    {
        sysRecruitService.updateRecruit(recruitId, sysRecruit);
        return Result.success(recruitId);
    }

    /**
     * 删除招聘信息
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long id)
    {
        sysRecruitService.deleteRecruit(id);
        return Result.success(id);
    }
}
