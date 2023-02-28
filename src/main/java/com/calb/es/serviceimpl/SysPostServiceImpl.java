package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysPostMapper;
import com.calb.es.model.SysPost;
import com.calb.es.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 岗位信息Service业务层处理
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysPostServiceImpl implements SysPostService
{
    @Autowired
    private SysPostMapper sysPostMapper;

    /**
     * 查询岗位信息列表
     * 
     * @param sysPost 岗位信息
     * @return 岗位信息
     */
    @Override
    public List<SysPost> selectSysPostList(SysPost sysPost)
    {
        return sysPostMapper.selectPostList(sysPost);
    }

    /**
     * 新增岗位信息
     * 
     * @param sysPost 岗位信息
     * @return 结果
     */
    @Override
    public int insertSysPost(SysPost sysPost)
    {
//        sysPost.setCreateTime(DateUtils.getNowDate());
        return sysPostMapper.insertPost(sysPost);
    }

    /**
     * 修改岗位信息
     *
     * @param sysPost 岗位信息
     * @return 结果
     */
    @Override
    public int updateSysPost(SysPost sysPost)
    {
        return sysPostMapper.updatePost(sysPost);
    }
//    /**
//     * 批量删除岗位信息
//     *
//     * @param postIds 需要删除的岗位信息主键
//     * @return 结果
//     */
//    @Override
////    public int deleteSysPostByPostIds(String postIds)
////    {
////        return sysPostMapper.deleteSysPostByPostIds(Convert.toStrArray(postIds));
////    }
    /**
     * 删除岗位信息信息
     * 
     * @param postId 岗位信息主键
     * @return 结果
     */
    @Override
    public int deleteSysPostByPostId(Long postId)
    {
        return sysPostMapper.deletePost(postId);
    }
}
