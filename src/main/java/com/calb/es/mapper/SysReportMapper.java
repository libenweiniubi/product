package com.calb.es.mapper;

import com.calb.es.model.SysReport;

import java.util.List;

public interface SysReportMapper
{
    /**
     * 查询周报表
     * @param sysReport
     * @param date
     * @return
     */
    public List<SysReport> selectWeekReport(SysReport sysReport, int date);

    /**
     * 查询月报表
     * @param sysReport
     * @param date
     * @return
     */
    public List<SysReport> selectMonthReport(SysReport sysReport,int date);

    /**
     * 查询年报表
     * @param sysReport
     * @param date
     * @return
     */
    public List<SysReport> selectYearReport(SysReport sysReport,int date);
}
