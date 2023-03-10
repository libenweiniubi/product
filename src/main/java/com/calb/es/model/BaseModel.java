package com.calb.es.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 实体类基类
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class BaseModel implements Serializable
{
    /**创建者**/
    private String createBy;

    /**创建时间**/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 备注 */
    private String remark;
    /** 请求参数 */
    private Map<String, Object> params;

    public void setCreateTime(Date createTime)
    {
        createTime=new Date();
        this.createTime = createTime;
    }

    public Map<String, Object> getParams()
    {
        if (params == null)
        {
            params = new HashMap<>();
        }
        return params;
    }

    public void setParams(Map<String, Object> params)
    {
        this.params = params;
    }
}
