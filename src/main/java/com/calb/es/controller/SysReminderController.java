package com.calb.es.controller;

import java.sql.Date;
import java.util.List;

import com.calb.es.model.Result;
import com.calb.es.model.SysReminder;
import com.calb.es.service.SysReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 提醒任务Controller
 *
 * @author lpd
 * @date 2022-08-29
 */
@Controller
@RequestMapping("/system/reminder")
public class SysReminderController
{
    @Autowired
    private SysReminderService sysReminderService;
    /**
     * 根据ID查询提醒任务列表
     */
    @GetMapping("/list")
    @ResponseBody
    public  List<SysReminder> selectSysReminderListById(SysReminder sysReminder)
    {
        List<SysReminder> list = sysReminderService.selectSysReminderList(sysReminder);
        return list;
    }

    /**
     * 新增提醒任务
     */
    @PostMapping("/add")
    @ResponseBody
    public Result addSave(@RequestBody SysReminder sysReminder)
    {
//        sysReminder.setCreateTime(System.currentTimeMillis());
        sysReminderService.insertSysReminder(sysReminder);
        return Result.success(sysReminder);
    }

    /**
     * 修改提醒任务
     */
    @PostMapping("/edit")
    @ResponseBody
    public Result<SysReminder> edit(@RequestBody SysReminder sysReminder)
    {
        sysReminderService.updateSysReminder(sysReminder);
        return Result.success(sysReminder);
    }


    /**
     * 删除提醒任务
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long id)
    {
        sysReminderService.deleteSysReminderByReminderId(id);
        return Result.success(id);
    }
}
