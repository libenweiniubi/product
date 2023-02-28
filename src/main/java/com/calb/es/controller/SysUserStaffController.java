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
//import com.calb.hese.system.domain.SysUserStaff;
//import com.calb.hese.system.service.ISysUserStaffService;
//import com.ruoyi.common.core.controller.BaseController;
//import com.ruoyi.common.core.domain.AjaxResult;
//import com.ruoyi.common.utils.poi.ExcelUtil;
//import com.ruoyi.common.core.page.TableDataInfo;
//
///**
// * 用户员工关联Controller
// *
// * @author lpd
// * @date 2022-08-29
// */
//@Controller
//@RequestMapping("/system/staff")
//public class SysUserStaffController extends BaseController
//{
//    private String prefix = "system/staff";
//
//    @Autowired
//    private ISysUserStaffService sysUserStaffService;
//
//    @RequiresPermissions("system:staff:view")
//    @GetMapping()
//    public String staff()
//    {
//        return prefix + "/staff";
//    }
//
//    /**
//     * 查询用户员工关联列表
//     */
//    @RequiresPermissions("system:staff:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysUserStaff sysUserStaff)
//    {
//        startPage();
//        List<SysUserStaff> list = sysUserStaffService.selectSysUserStaffList(sysUserStaff);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出用户员工关联列表
//     */
//    @RequiresPermissions("system:staff:export")
//    @Log(title = "用户员工关联", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(SysUserStaff sysUserStaff)
//    {
//        List<SysUserStaff> list = sysUserStaffService.selectSysUserStaffList(sysUserStaff);
//        ExcelUtil<SysUserStaff> util = new ExcelUtil<SysUserStaff>(SysUserStaff.class);
//        return util.exportExcel(list, "用户员工关联数据");
//    }
//
//    /**
//     * 新增用户员工关联
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存用户员工关联
//     */
//    @RequiresPermissions("system:staff:add")
//    @Log(title = "用户员工关联", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(SysUserStaff sysUserStaff)
//    {
//        return toAjax(sysUserStaffService.insertSysUserStaff(sysUserStaff));
//    }
//
//    /**
//     * 修改用户员工关联
//     */
//    @RequiresPermissions("system:staff:edit")
//    @GetMapping("/edit/{userId}")
//    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
//    {
//        SysUserStaff sysUserStaff = sysUserStaffService.selectSysUserStaffByUserId(userId);
//        mmap.put("sysUserStaff", sysUserStaff);
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存用户员工关联
//     */
//    @RequiresPermissions("system:staff:edit")
//    @Log(title = "用户员工关联", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(SysUserStaff sysUserStaff)
//    {
//        return toAjax(sysUserStaffService.updateSysUserStaff(sysUserStaff));
//    }
//
//    /**
//     * 删除用户员工关联
//     */
//    @RequiresPermissions("system:staff:remove")
//    @Log(title = "用户员工关联", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(sysUserStaffService.deleteSysUserStaffByUserIds(ids));
//    }
//}
