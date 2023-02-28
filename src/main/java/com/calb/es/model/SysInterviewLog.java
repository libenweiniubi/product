package com.calb.es.model;

import java.util.Date;

/**
 * 面试记录表 sys_interview_log
 * @author pandeng.li
 */
public class SysInterviewLog
{
    /**面试编号**/
    private int interviewId;
    /**面试序号**/
    private int interviewNumber;
    /**状态**/
    private String status;
    /**面试记录**/
    private String log;
    /**下次面试的时间**/
    private Date nextTime;
}

