package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 招聘信息表 sys_recruit
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysRecruit extends BaseModel
{
    /**招聘编号**/
    private int recruitId;
    /**招聘部门**/
    private String recruitDept;
    /**招聘岗位**/
    private String recruitPost;
    /**工作经验**/
    private String worktime;
    /**薪资待遇**/
    private int salary;
    /**学历**/
    private String education;
    /**工作地点**/
    private String workplace;
    /**招聘人数**/
    private int number;
    /**需求人**/
    private String demander;
    /**职位描述**/
    private String jobDescription;
    /**岗位要求**/
    private String jobRequirements;
}
