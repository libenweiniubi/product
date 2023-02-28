package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 待办提醒
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysReminder extends BaseModel
{
    /**
     * 待办事项ID
     */
    private int reminderId;
    /**
     * 待办事项状态
     */
    private int reminderFlag;
    /**
     * 待办事项类别
     */
    private String reminderType;
    /**
     * 提醒的天数
     */
    private int reminderDays;
}
