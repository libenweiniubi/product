package com.calb.es.mapper;
import com.calb.es.model.SysDictData;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 字典数据Mapper接口
 * 
 * @author lpd
 * @date 2022-08-29
 */
@Repository
public interface SysDictDataMapper 
{
    /**
     * 查询字典数据
     * 
     * @param dictCode 字典数据主键
     * @return 字典数据
     */
    public SysDictData selectSysDictDataByDictCode(Long dictCode);

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
     * 删除字典数据
     * 
     * @param dictCode 字典数据主键
     * @return 结果
     */
    public int deleteSysDictDataByDictCode(Long dictCode);

    /**
     * 批量删除字典数据
     * 
     * @param dictCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysDictDataByDictCodes(String[] dictCodes);
}
