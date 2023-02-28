package com.calb.es.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 入职信息表 sys_induction
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysInduction extends BaseModel
{
    /**入职信息编号**/
    private int inductionId;
    /**姓名**/
    private String name;
    /**性别**/
    private String sex;
    /**部门**/
    private String dept;
    /**岗位**/
    private String post;
    /**电话**/
    private String phone;
    /**邮箱**/
    private String email;
    /**状态**/
    private String status;
    /**入职时间**/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hiredate;
    /**学历**/
    private String education;
    /**学位**/
    private String degree;
}
