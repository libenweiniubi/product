package com.calb.es.mapper;

import com.calb.es.model.SysInduction;

public interface SysInductionMapper
{
    /**
     * 添加入职信息
     * @param sysInduction
     * @return
     */
    public int insertInduction(SysInduction sysInduction);

    /**
     * 根据ID删除入职信息
     * @param inductionId
     * @return
     */
    public int deleteInductionById(Long inductionId);

    /**
     * 编辑入职信息
     * @param sysInduction
     * @param inductionId
     * @return
     */
    public int updateInduction(SysInduction sysInduction,Long inductionId);

    /**
     * 根据状态查询入职信息（0,待入职；1，入职；2，未入职）
     * @param sysInduction
     * @param status
     * @return
     */
    public int selectInductionByStatus(SysInduction sysInduction,int status);
}
