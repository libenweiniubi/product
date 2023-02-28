//package com.calb.es.controller;
//
//import java.util.List;
//import org.apache.shiro.ini.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import com.ruoyi.common.annotation.Log;
//import com.ruoyi.common.enums.BusinessType;
//import com.calb.hese.system.domain.SysUser;
//import com.calb.hese.system.service.ISysUserService;
//import com.ruoyi.common.core.controller.BaseController;
//import com.ruoyi.common.core.domain.AjaxResult;
//import com.ruoyi.common.utils.poi.ExcelUtil;
//import com.ruoyi.common.core.page.TableDataInfo;
//
///**
// * 用户信息Controller
// *
// * @author lpd
// * @date 2022-08-29
// */
//@Controller
//@RequestMapping("/system/user")
//public class SysUserController extends BaseController
//{
//    private String prefix = "system/user";
//
//    @Autowired
//    private ISysUserService sysUserService;
//
//    @RequiresPermissions("system:user:view")
//    @GetMapping()
//    public String user()
//    {
//        return prefix + "/user";
//    }
//
//    /**
//     * 查询用户信息列表
//     */
//    @RequiresPermissions("system:user:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysUser sysUser)
//    {
//        startPage();
//        List<SysUser> list = sysUserService.selectSysUserList(sysUser);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出用户信息列表
//     */
//    @RequiresPermissions("system:user:export")
//    @Log(title = "用户信息", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(SysUser sysUser)
//    {
//        List<SysUser> list = sysUserService.selectSysUserList(sysUser);
//        ExcelUtil<SysUser> util = new ExcelUtil<SysUser>(SysUser.class);
//        return util.exportExcel(list, "用户信息数据");
//    }
//
//    /**
//     * 新增用户信息
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存用户信息
//     */
//    @RequiresPermissions("system:user:add")
//    @Log(title = "用户信息", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(SysUser sysUser)
//    {
//        return toAjax(sysUserService.insertSysUser(sysUser));
//    }
//
//    /**
//     * 修改用户信息
//     */
//    @RequiresPermissions("system:user:edit")
//    @GetMapping("/edit/{userId}")
//    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
//    {
//        SysUser sysUser = sysUserService.selectSysUserByUserId(userId);
//        mmap.put("sysUser", sysUser);
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存用户信息
//     */
//    @RequiresPermissions("system:user:edit")
//    @Log(title = "用户信息", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(SysUser sysUser)
//    {
//        return toAjax(sysUserService.updateSysUser(sysUser));
//    }
//
//    /**
//     * 删除用户信息
//     */
//    @RequiresPermissions("system:user:remove")
//    @Log(title = "用户信息", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(sysUserService.deleteSysUserByUserIds(ids));
//    }
//}
