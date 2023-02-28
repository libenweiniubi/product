package com.calb.es.mapper;

import com.calb.es.model.SysReminder;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author lpd
 * @date 2022-08-29
 */
public interface SysReminderMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param reminderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
//    public SysReminder selectSysReminderByReminderId(Long reminderId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysReminder 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysReminder> selectSysReminderList(SysReminder sysReminder);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysReminder 【请填写功能名称】
     * @return 结果
     */
    public int insertSysReminder(SysReminder sysReminder);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysReminder 【请填写功能名称】
     * @return 结果
     */
    public int updateSysReminder(SysReminder sysReminder);

    /**
     * 删除【请填写功能名称】
     * 
     * @param reminderId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysReminderByReminderId(Long reminderId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param reminderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysReminderByReminderIds(String[] reminderIds);
}
