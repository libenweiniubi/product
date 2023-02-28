package com.calb.es.mapper;

import com.calb.es.model.SysInterview;

public interface SysInterviewMapper
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
    public int deleteInterviewById(SysInterview sysInterview, Long interviewid);

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
