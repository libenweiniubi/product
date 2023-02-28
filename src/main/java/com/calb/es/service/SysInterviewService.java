package com.calb.es.service;

import com.calb.es.model.SysInterview;

/**
 * 面试信息管理
 * @author pandeng.li
 */
public interface SysInterviewService
{
    /**
     * 新增面试信息
     * @param sysInterview
     * @return
     */
    public int insertInterview(SysInterview sysInterview);

    /**
     * 删除面试信息
     * @param sysInterview
     * @return
     */
    public int deleteInterview(SysInterview sysInterview);

    /**
     * 编辑面试信息/确认入职
     * @param interviewId
     * @param sysInterview
     * @return
     */
    public int updateInterview(SysInterview sysInterview,int interviewId);

    /**
     * 查询面试信息列表
     * @param sysInterview
     * @return
     */
    public int selectInterviewList(SysInterview sysInterview);
}
