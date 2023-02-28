package com.calb.es.service;

import com.calb.es.model.SysInterview;
import com.calb.es.model.SysInterviewLog;

import java.util.List;

/**
 * 面试记录管理
 * @author pandeng.li
 */
public interface SysInterviewLogService
{
    /**
     * 新增面试记录
     * @return
     */
 public int insertInterviewLog(SysInterviewLog sysInterviewLog,int interviewLogId);

 /**
  * 根据ID更新面试记录
  * @param sysInterviewLog
  * @param interviewLogId
  * @return
  */
 public int updateInterviewLog(SysInterviewLog sysInterviewLog,int interviewLogId);

 /**
  * 删除面试记录
  * @param sysInterviewLog
  * @return
  */
 public int deleteInterviewLog(SysInterviewLog sysInterviewLog);

 /**
  * 查询面试列表
  * @param sysInterviewLog
  * @param interviewLogId
  * @return
  */
 public List<SysInterviewLog> selectInterviewLog(SysInterviewLog sysInterviewLog,int interviewLogId);
 }
