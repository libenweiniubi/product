package com.calb.es.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 岗位信息表 sys_post
 * @author pandeng.li
 */
@Data
@Accessors(chain = true)
public class SysPost extends BaseModel
{
    /**岗位编号**/
    private int postId;
    /**岗位名称**/
    private String postName;
    /**显示顺序**/
    private int postSort;
    /**岗位状态**/
    private String status;
}
