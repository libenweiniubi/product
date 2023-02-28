package com.calb.es.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 员工信息对象 sys_staff
 * 
 * @author lpd
 * @date 2022-08-29
 */
public class SysStaff extends BaseModel
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;

    /** 用户昵称 */
//    @Excel(name = "用户昵称")
    private String userName;

    /** 用户性别（0男 1女 2未知） */
//    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 部门ID */
//    @Excel(name = "部门ID")
    private Long deptId;

    /** 岗位 */
//    @Excel(name = "岗位")
    private String post;

    /** 手机号码 */
//    @Excel(name = "手机号码")
    private String phone;

    /** 用户邮箱 */
//    @Excel(name = "用户邮箱")
    private String email;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setPost(String post) 
    {
        this.post = post;
    }

    public String getPost() 
    {
        return post;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("sex", getSex())
            .append("deptId", getDeptId())
            .append("post", getPost())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
