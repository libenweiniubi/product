package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 面试信息表 sys_interview
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysInterview extends BaseModel
{
    /**面试编号**/
    private int interviewId;
    /**面试岗位**/
    private String post;
    /**面试官**/
    private String interviewer;
    /**面试时间**/
    private Date date;
}
