package com.calb.es.serviceimpl;


import com.calb.es.mapper.SysResumeMapper;
import com.calb.es.model.SysResume;
import com.calb.es.service.SysResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 简历库Service业务层处理
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysResumeServiceImpl implements SysResumeService
{
    @Autowired
    private SysResumeMapper sysResumeMapper;

    /**
     * 查询简历库
     * 
     * @param resumeId 简历库主键
     * @return 简历库
     */
//    @Override
//    public SysResume selectSysResumeByResumeId(Long resumeId)
//    {
//        return sysResumeMapper.selectSysResumeByResumeId(resumeId);
//    }

    /**
     * 查询简历库列表
     * 
     * @param sysResume 简历库
     * @return 简历库
     */
    @Override
    public List<SysResume> selectResumeList(SysResume sysResume)
    {
        return sysResumeMapper.selectSysResumeList(sysResume);
    }

    /**
     * 新增简历库
     * 
     * @param sysResume 简历库
     * @return 结果
     */
    @Override
    public int insertResume(SysResume sysResume)
    {
        return sysResumeMapper.insertSysResume(sysResume);
    }

    /**
     * 修改简历库
     * 
     * @param sysResume 简历库
     * @return 结果
     */
    @Override
    public int updateResume(SysResume sysResume,Long resumeId)
    {
        return sysResumeMapper.updateSysResume(sysResume,resumeId);
    }

    /**
     * 删除简历库信息
     * 
     * @param resumeId 简历库主键
     * @return 结果
     */
    @Override
    public int deleteResume(Long resumeId)
    {
        return sysResumeMapper.deleteSysResumeByResumeId(resumeId);
    }
}
