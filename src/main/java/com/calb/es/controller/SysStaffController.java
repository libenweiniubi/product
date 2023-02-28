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
//import com.calb.hese.system.domain.SysStaff;
//import com.calb.hese.system.service.ISysStaffService;
//import com.ruoyi.common.core.controller.BaseController;
//import com.ruoyi.common.core.domain.AjaxResult;
//import com.ruoyi.common.utils.poi.ExcelUtil;
//import com.ruoyi.common.core.page.TableDataInfo;
//
///**
// * 员工信息Controller
// *
// * @author lpd
// * @date 2022-08-29
// */
//@Controller
//@RequestMapping("/system/staff")
//public class SysStaffController extends BaseController
//{
//    private String prefix = "system/staff";
//
//    @Autowired
//    private ISysStaffService sysStaffService;
//
//    @RequiresPermissions("system:staff:view")
//    @GetMapping()
//    public String staff()
//    {
//        return prefix + "/staff";
//    }
//
//    /**
//     * 查询员工信息列表
//     */
//    @RequiresPermissions("system:staff:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysStaff sysStaff)
//    {
//        startPage();
//        List<SysStaff> list = sysStaffService.selectSysStaffList(sysStaff);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出员工信息列表
//     */
//    @RequiresPermissions("system:staff:export")
//    @Log(title = "员工信息", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(SysStaff sysStaff)
//    {
//        List<SysStaff> list = sysStaffService.selectSysStaffList(sysStaff);
//        ExcelUtil<SysStaff> util = new ExcelUtil<SysStaff>(SysStaff.class);
//        return util.exportExcel(list, "员工信息数据");
//    }
//
//    /**
//     * 新增员工信息
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存员工信息
//     */
//    @RequiresPermissions("system:staff:add")
//    @Log(title = "员工信息", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(SysStaff sysStaff)
//    {
//        return toAjax(sysStaffService.insertSysStaff(sysStaff));
//    }
//
//    /**
//     * 修改员工信息
//     */
//    @RequiresPermissions("system:staff:edit")
//    @GetMapping("/edit/{userId}")
//    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
//    {
//        SysStaff sysStaff = sysStaffService.selectSysStaffByUserId(userId);
//        mmap.put("sysStaff", sysStaff);
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存员工信息
//     */
//    @RequiresPermissions("system:staff:edit")
//    @Log(title = "员工信息", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(SysStaff sysStaff)
//    {
//        return toAjax(sysStaffService.updateSysStaff(sysStaff));
//    }
//
//    /**
//     * 删除员工信息
//     */
//    @RequiresPermissions("system:staff:remove")
//    @Log(title = "员工信息", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(sysStaffService.deleteSysStaffByUserIds(ids));
//    }
//}
