package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysInductionMapper;
import com.calb.es.model.SysInduction;
import com.calb.es.service.SysInductionService;
import org.springframework.beans.factory.annotation.Autowired;

public class SysInductionServiceImpl implements SysInductionService
{

    @Autowired
    private SysInductionMapper sysInductionMapper;
    /**
     * 添加入职信息
     *
     * @param sysInduction
     * @return
     */
    @Override
    public int insertInduction(SysInduction sysInduction) {
        return 0;
    }

    /**
     * 根据ID删除入职信息
     *
     * @param inductionId
     * @return
     */
    @Override
    public int deleteInductionById(Long inductionId) {
        return 0;
    }

    /**
     * 编辑入职信息
     *
     * @param sysInduction
     * @param inductionId
     * @return
     */
    @Override
    public int updateInduction(SysInduction sysInduction, Long inductionId) {
        return 0;
    }

    /**
     * 根据状态查询入职信息（0,待入职；1，入职；2，未入职）
     *
     * @param sysInduction
     * @param status
     * @return
     */
    @Override
    public int selectInductionByStatus(SysInduction sysInduction, int status) {
        return 0;
    }
}
