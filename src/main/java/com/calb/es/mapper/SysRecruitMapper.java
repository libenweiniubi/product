package com.calb.es.mapper;


import com.calb.es.model.SysRecruit;

import java.util.List;

/**
 * 招聘信息Mapper接口
 *
 * @author lpd
 * @date 2022-08-29
 */
public interface SysRecruitMapper
{
    /**
     * 查询招聘信息
     *
     * @param recruitId 招聘信息主键
     * @return 招聘信息
     */
    public SysRecruit selectSysRecruitByRecruitId(Long recruitId);

    /**
     * 查询招聘信息列表
     *
     * @param sysRecruit 招聘信息
     * @return 招聘信息集合
     */
    public List<SysRecruit> selectSysRecruitList(SysRecruit sysRecruit);

    /**
     * 新增招聘信息
     *
     * @param sysRecruit 招聘信息
     * @return 结果
     */
    public int insertSysRecruit(SysRecruit sysRecruit);

    /**
     * 修改招聘信息
     *
     * @param sysRecruit 招聘信息
     * @return 结果
     */
    public int updateSysRecruit(SysRecruit sysRecruit);

    /**
     * 删除招聘信息
     *
     * @param recruitId 招聘信息主键
     * @return 结果
     */
    public int deleteSysRecruitByRecruitId(Long recruitId);

    /**
     * 批量删除招聘信息
     *
     * @param recruitIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRecruitByRecruitIds(String[] recruitIds);
}
