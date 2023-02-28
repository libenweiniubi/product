package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysRecruitMapper;
import com.calb.es.model.SysRecruit;
import com.calb.es.service.SysRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 招聘信息Service业务层处理
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysRecruitServiceImpl implements SysRecruitService
{
    @Autowired
    private SysRecruitMapper sysRecruitMapper;

    /**
     * 查询招聘信息列表
     * 
     * @param sysRecruit 招聘信息
     * @return 招聘信息
     */
    @Override
    public List<SysRecruit> selectRecruitList(SysRecruit sysRecruit)
    {
        return sysRecruitMapper.selectSysRecruitList(sysRecruit);
    }

    /**
     * 新增招聘信息
     * 
     * @param sysRecruit 招聘信息
     * @return 结果
     */
    @Override
    public int insertRecruit(SysRecruit sysRecruit)
    {
        return sysRecruitMapper.insertSysRecruit(sysRecruit);
    }

    /**
     * 修改招聘信息
     * 
     * @param sysRecruit 招聘信息
     * @return 结果
     */
    @Override
    public int updateRecruit(Long recruitId,SysRecruit sysRecruit)
    {
        return sysRecruitMapper.updateSysRecruit(sysRecruit);
    }


    /**
     * 删除招聘信息信息
     * 
     * @param recruitId 招聘信息主键
     * @return 结果
     */
    @Override
    public int deleteRecruit(Long recruitId)
    {
        return sysRecruitMapper.deleteSysRecruitByRecruitId(recruitId);
    }
}
