package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysReminderMapper;
import com.calb.es.model.SysReminder;
import com.calb.es.service.SysReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysReminderServiceImpl implements SysReminderService
{
    @Autowired
    private SysReminderMapper sysReminderMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param reminderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
//    @Override
//    public SysReminder selectSysReminderByReminderId(Long reminderId)
//    {
//        return sysReminderMapper.selectSysReminderByReminderId(reminderId);
//    }

    /**
     * 查询提醒任务列表
     * 
     * @param sysReminder
     * @return
     */
    @Override
    public List<SysReminder> selectSysReminderList(SysReminder sysReminder)
    {
        return sysReminderMapper.selectSysReminderList(sysReminder);
    }

    /**
     * 新增提醒任务
     * 
     * @param sysReminder
     * @return 结果
     */
    @Override
    public int insertSysReminder(SysReminder sysReminder)
    {
        return sysReminderMapper.insertSysReminder(sysReminder);
    }

    /**
     * 修改提醒任务
     * 
     * @param sysReminder
     * @return 结果
     */
    @Override
    public int updateSysReminder(SysReminder sysReminder)
    {
        return sysReminderMapper.updateSysReminder(sysReminder);
    }


    /**
     * 删除提醒任务
     * 
     * @param reminderId 主键
     * @return 结果
     */
    @Override
    public int deleteSysReminderByReminderId(Long reminderId)
    {
        return sysReminderMapper.deleteSysReminderByReminderId(reminderId);
    }
}
