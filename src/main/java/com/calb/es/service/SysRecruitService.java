package com.calb.es.service;

import com.calb.es.model.SysRecruit;

import java.util.List;

/**
 * 招聘计划管理
 * @author pandeng.li
 */
public interface SysRecruitService
{
    /**
     * 新增招聘计划
     * @param sysRecruit
     * @return
     */
    public int insertRecruit(SysRecruit sysRecruit);

    /**
     * 删除招聘计划
     * @param
     * @return
     */
    public int deleteRecruit(Long recruitId);

    /**
     * 更新招聘计划
     * @param sysRecruit
     * @param recruitId
     * @return
     */
    public int updateRecruit(Long recruitId,SysRecruit sysRecruit);

    /**
     * 查询招聘计划列表
     * @param sysRecruit
     * @return
     */
    public List<SysRecruit> selectRecruitList(SysRecruit sysRecruit);
}
