package com.calb.es.mapper;


import com.calb.es.model.SysResume;

import java.util.List;

/**
 * 简历库Mapper接口
 *
 * @author lpd
 * @date 2022-08-29
 */
public interface SysResumeMapper
{
    /**
     * 查询简历库
     *
     * @param resumeId 简历库主键
     * @return 简历库
     */
    public SysResume selectSysResumeByResumeId(Long resumeId);

    /**
     * 查询简历库列表
     *
     * @param sysResume 简历库
     * @return 简历库集合
     */
    public List<SysResume> selectSysResumeList(SysResume sysResume);

    /**
     * 新增简历库
     *
     * @param sysResume 简历库
     * @return 结果
     */
    public int insertSysResume(SysResume sysResume);

    /**
     * 修改简历库
     *
     * @param sysResume 简历库
     * @return 结果
     */
    public int updateSysResume(SysResume sysResume,Long resumeId);

    /**
     * 删除简历库
     *
     * @param resumeId 简历库主键
     * @return 结果
     */
    public int deleteSysResumeByResumeId(Long resumeId);

    /**
     * 批量删除简历库
     *
     * @param resumeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysResumeByResumeIds(String[] resumeIds);
}
