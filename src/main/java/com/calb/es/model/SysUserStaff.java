package com.calb.es.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户员工关联对象 sys_user_staff
 * 
 * @author lpd
 * @date 2022-08-29
 */
public class SysUserStaff extends BaseModel
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long userId;

    /** 员工id */
    private String staffId;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setStaffId(String staffId) 
    {
        this.staffId = staffId;
    }

    public String getStaffId() 
    {
        return staffId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("staffId", getStaffId())
            .toString();
    }
}
