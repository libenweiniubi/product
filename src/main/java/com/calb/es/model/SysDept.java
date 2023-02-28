package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 部门信息表 sys_dept
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysDept extends BaseModel
{
    /**部门id**/
    private int deptId;
    /**父部门id**/
    private int deptFatherId;
    /**部门名称**/
    private String deptName;
    /**显示顺序**/
    private int orderNum;
    /**部门领导**/
    private String deptLeader;
    /**部门联系方式**/
    private String deptPhone;
    /**部门邮箱**/
    private String deptEmail;
    /**部门状态(0正常，1异常，2删除)**/
    private int deptStatus;
    /**删除标志（0未删除，1删除）**/
    private int delFlag;
}
