package com.calb.es.service;


import com.calb.es.model.SysPost;

import java.util.List;

/**
 * 岗位信息Service接口
 *
 * @author lpd
 * @date 2022-08-29
 */
public interface SysPostService
{
    /**
     * 查询岗位信息列表
     *
     * @param sysPost 岗位信息
     * @return 岗位信息集合
     */
    public List<SysPost> selectSysPostList(SysPost sysPost);

    /**
     * 新增岗位信息
     *
     * @param sysPost 岗位信息
     * @return 结果
     */
    public int insertSysPost(SysPost sysPost);

    /**
     * 修改岗位信息
     *
     * @param sysPost 岗位信息
     * @return 结果
     */
    public int updateSysPost(SysPost sysPost);

    /**
     * 删除岗位信息信息
     *
     * @param postId 岗位信息主键
     * @return 结果
     */
    public int deleteSysPostByPostId(Long postId);
}
