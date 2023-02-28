package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 简历库  sys_resum
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysResume extends BaseModel
{
    /**简历编号**/
    private int resumeId;
    /**姓名**/
    private String name;
    /**应聘岗位**/
    private String post;
    /**联系电话**/
    private String phone;
    /**性别**/
    private String sex;
    /**身份证**/
    private String idcard;
    /**来源**/
    private String source;
    /**简历存放路径**/
    private String resumePath;
}
