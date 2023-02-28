package com.calb.es.controller;

import com.calb.es.model.Result;
import com.calb.es.model.SysPost;
import com.calb.es.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 岗位信息Controller
 *
 * @author lpd
 * @date 2022-08-29
 */
@Controller
@RequestMapping("/system/post")
public class SysPostController
{


    @Autowired
    private SysPostService sysPostService;

    /**
     * 查询岗位信息列表
     */

    @GetMapping("/list")
    @ResponseBody
    public  List selectSysPostByPostId(SysPost sysPost)
    {

        List<SysPost> list = sysPostService.selectSysPostList(sysPost);
        return list;
    }

    /**
     * 新增岗位信息
     */
    @PostMapping("/add")
    @ResponseBody
    public Result<SysPost> addSave(@RequestBody SysPost sysPost)
    {
        sysPostService.insertSysPost(sysPost);
        return Result.success(sysPost);
    }

    /**
     * 修改岗位信息
     */
    @PostMapping("/edit")
    @ResponseBody
    public Result edit(@RequestBody SysPost sysPost)
    {
        sysPostService.updateSysPost(sysPost);
        return  Result.success(sysPost);
    }

    /**
     * 删除岗位信息
     */
    @PostMapping( "/remove")
    @ResponseBody
    public Result remove(Long postId)
    {
        sysPostService.deleteSysPostByPostId(postId);
        return Result.success(postId);
    }
}
