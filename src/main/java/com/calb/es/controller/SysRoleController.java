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
//import com.calb.hese.system.domain.SysRole;
//import com.calb.hese.system.service.ISysRoleService;
//import com.ruoyi.common.core.controller.BaseController;
//import com.ruoyi.common.core.domain.AjaxResult;
//import com.ruoyi.common.utils.poi.ExcelUtil;
//import com.ruoyi.common.core.page.TableDataInfo;
//
///**
// * 角色信息Controller
// *
// * @author lpd
// * @date 2022-08-29
// */
//@Controller
//@RequestMapping("/system/role")
//public class SysRoleController extends BaseController
//{
//    private String prefix = "system/role";
//
//    @Autowired
//    private ISysRoleService sysRoleService;
//
//    @RequiresPermissions("system:role:view")
//    @GetMapping()
//    public String role()
//    {
//        return prefix + "/role";
//    }
//
//    /**
//     * 查询角色信息列表
//     */
//    @RequiresPermissions("system:role:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysRole sysRole)
//    {
//        startPage();
//        List<SysRole> list = sysRoleService.selectSysRoleList(sysRole);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出角色信息列表
//     */
//    @RequiresPermissions("system:role:export")
//    @Log(title = "角色信息", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(SysRole sysRole)
//    {
//        List<SysRole> list = sysRoleService.selectSysRoleList(sysRole);
//        ExcelUtil<SysRole> util = new ExcelUtil<SysRole>(SysRole.class);
//        return util.exportExcel(list, "角色信息数据");
//    }
//
//    /**
//     * 新增角色信息
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存角色信息
//     */
//    @RequiresPermissions("system:role:add")
//    @Log(title = "角色信息", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(SysRole sysRole)
//    {
//        return toAjax(sysRoleService.insertSysRole(sysRole));
//    }
//
//    /**
//     * 修改角色信息
//     */
//    @RequiresPermissions("system:role:edit")
//    @GetMapping("/edit/{roleId}")
//    public String edit(@PathVariable("roleId") Long roleId, ModelMap mmap)
//    {
//        SysRole sysRole = sysRoleService.selectSysRoleByRoleId(roleId);
//        mmap.put("sysRole", sysRole);
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存角色信息
//     */
//    @RequiresPermissions("system:role:edit")
//    @Log(title = "角色信息", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(SysRole sysRole)
//    {
//        return toAjax(sysRoleService.updateSysRole(sysRole));
//    }
//
//    /**
//     * 删除角色信息
//     */
//    @RequiresPermissions("system:role:remove")
//    @Log(title = "角色信息", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(sysRoleService.deleteSysRoleByRoleIds(ids));
//    }
//}
