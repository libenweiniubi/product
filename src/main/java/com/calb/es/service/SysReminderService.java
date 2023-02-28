package com.calb.es.service;

import com.calb.es.model.SysReminder;

import java.util.List;

/**
 * 提醒任务Service接口
 *
 * @author lpd
 * @date 2022-08-29
 */
public interface SysReminderService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param reminderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
//    public SysReminder selectSysReminderByReminderId(Long reminderId);

    /**
     * 查询提醒任务列表
     *
     * @param sysReminder
     * @return
     */
    public List<SysReminder> selectSysReminderList(SysReminder sysReminder);

    /**
     * 新增提醒任务
     *
     * @param sysReminder
     * @return 结果
     */
    public int insertSysReminder(SysReminder sysReminder);

    /**
     * 修改提醒任务
     *
     * @param sysReminder
     * @return 结果
     */
    public int updateSysReminder(SysReminder sysReminder);

    /**
     * 删除提醒任务
     *
     * @param reminderId
     * @return 结果
     */
    public int deleteSysReminderByReminderId(Long reminderId);
}
