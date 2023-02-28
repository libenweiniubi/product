package com.calb.es.controller;

import java.util.List;
import com.calb.es.model.Result;
import com.calb.es.model.SysDictData;
import com.calb.es.service.SysDictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 字典数据Controller
 * @author lpd
 * @date 2022-08-29
 */
@Controller
@RequestMapping("/system/data")
public class SysDictDataController
{
    @Autowired
    private SysDictDataService sysDictDataService;

    /**
     * 查询字典数据列表
     */
    @GetMapping("/list")
    @ResponseBody
    public List<SysDictData> selectDictData(SysDictData sysDictData)
    {
        List<SysDictData> list = sysDictDataService.selectSysDictDataList(sysDictData);
        return list;
    }

    /**
     * 新增字典数据
     */
    @PostMapping("/add")
    @ResponseBody
    public Result<SysDictData> addDictData(@RequestBody SysDictData sysDictData)
    {
        sysDictDataService.insertSysDictData(sysDictData);
        return Result.success(sysDictData);
    }

    /**
     * 修改字典数据
     */
    @PostMapping("/edit/{dictCode}")
    @ResponseBody
    public Result editDictData(@PathVariable("dictCode") Long dictCode, @RequestBody SysDictData dictData)
    {
        sysDictDataService.updateSysDictData(dictCode,dictData);
        return Result.success(dictData);
    }


    /**
     * 删除字典数据
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long id)
    {
        sysDictDataService.deleteSysDictDataByDictCode(id);
        return Result.success(id);

    }
}
