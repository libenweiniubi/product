package com.calb.es.mapper;

import com.calb.es.model.SysPost;

import java.util.List;

public interface SysPostMapper
{
    /**
     * 增设新岗位
     * @param sysPost
     * @return
     */
    public int insertPost(SysPost sysPost);

    /**
     * 删除指定的岗位
     * @param
     * @param postId
     * @return
     */
    public int deletePost(Long postId);

    /**
     * 编辑岗位信息
     * @param sysPost
     * @return
     */
    public int updatePost(SysPost sysPost);

    /**
     * 查询岗位信息列表
     * @param sysPost
     * @return
     */
    public List<SysPost> selectPostList(SysPost sysPost);
}
