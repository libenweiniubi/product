package com.calb.es.serviceimpl;

import com.calb.es.mapper.SysDictDataMapper;
import com.calb.es.model.Result;
import com.calb.es.model.SysDictData;
import com.calb.es.service.SysDictDataService;
import org.apache.http.impl.cookie.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 字典数据Service业务层处理
 *
 * @author lpd
 * @date 2022-08-29
 */
@Service
public class SysDictDataServiceImpl implements SysDictDataService
{
    @Autowired
    private SysDictDataMapper sysDictDataMapper;


    /**
     * 查询字典数据列表
     *
     * @param sysDictData 字典数据
     * @return 字典数据
     */
    @Override
    public List<SysDictData> selectSysDictDataList(SysDictData sysDictData)
    {
        return sysDictDataMapper.selectSysDictDataList(sysDictData);
    }


    /**
     * 修改字典数据
     *
     * @param
     * @return 结果
     */
    @Override
    public int updateSysDictData(Long dictCode,SysDictData dictData)
    {
        return sysDictDataMapper.updateSysDictData(dictCode,dictData);
    }

    /**
     * 新增字典数据
     *
     * @param sysDictData 字典数据
     * @return 结果
     */
    @Override
    public int insertSysDictData(SysDictData sysDictData)
    {
        return sysDictDataMapper.insertSysDictData(sysDictData);
    }

    /**
     * 删除字典数据信息
     *
     * @param dictCode 字典数据主键
     * @return 结果
     */
    @Override
    public int deleteSysDictDataByDictCode(Long dictCode)
    {
        return sysDictDataMapper.deleteSysDictDataByDictCode(dictCode);
    }
}
