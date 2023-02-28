package com.calb.es.service;

import com.calb.es.model.Result;
import com.calb.es.model.SysResume;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 *  简历库管理
 * @author pandeng.li
 */
public interface SysResumeService
{
    /**
     * 新增简历
     * @param sysResume
     * @return
     */
    public int insertResume(SysResume sysResume);

//    public Result upload(MultipartFile file);

    /**
     * 删除简历
     * @param resumeId
     * @return
     */
    public int deleteResume(Long resumeId);

    /**
     * 编辑简历
     * @param sysResume
     * @param resumeId
     * @return
     */
    public int updateResume(SysResume sysResume,Long resumeId);

    /**
     * 简历库查询列表
     * @param sysResume
     * @return
     */
    public List<SysResume> selectResumeList(SysResume sysResume);

//    public SysResume selectSysResumeByResumeId(Long resumId);

}
