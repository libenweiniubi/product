package com.calb.es.service;

import com.calb.es.model.SysDictData;
import java.util.List;
/**
 * 字典数据管理
 * 
 * @author lpd
 * @date 2022-08-29
 */
public interface SysDictDataService
{
    /**
     * 查询字典数据列表
     * 
     * @param sysDictData 字典数据
     * @return 字典数据集合
     */
    public List<SysDictData> selectSysDictDataList(SysDictData sysDictData);

    /**
     * 新增字典数据
     * 
     * @param sysDictData 字典数据
     * @return 结果
     */
    public int insertSysDictData(SysDictData sysDictData);

    /**
     * 修改字典数据
     * 
     * @param
     * @return 结果
     */
    public int updateSysDictData(Long dictCode,SysDictData dictData);


    /**
     * 删除字典数据信息
     * 
     * @param dictCode 字典数据主键
     * @return 结果
     */
    public int deleteSysDictDataByDictCode(Long dictCode);
}
