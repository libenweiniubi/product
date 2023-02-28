//package com.calb.es.controller;
//
//import com.calb.es.model.SysMenu;
//import com.calb.es.model.Result;
//import com.calb.es.model.SysRole;
//import com.calb.es.model.Ztree;
//import com.calb.es.service.SysMenuService;
//import com.calb.es.utils.ShiroUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * 菜单信息
// *
// * @author ruoyi
// */
//@Controller
//@RequestMapping("/system/menu")
//public class SysMenuController
//{
//    @Autowired
//    private SysMenuService menuService;
//
//    @GetMapping("/list")
//    @ResponseBody
//    public List<SysMenu> list(SysMenu menu)
//    {
//        Long userId = ShiroUtils.getUserId();
//        List<SysMenu> menuList = menuService.selectMenuList(menu, userId);
//        return menuList;
//    }
//
//    /**
//     * 删除菜单
//     */
//    @PostMapping("/remove/{menuId}")
//    @ResponseBody
//    public Result remove(@PathVariable("menuId") Long menuId)
//    {
//        if (menuService.selectCountMenuByParentId(menuId) > 0)
//        {
//            return Result.error(400,"存在子菜单,不允许删除");
//        }
//        if (menuService.selectCountRoleMenuByMenuId(menuId) > 0)
//        {
//            return Result.error(401,"菜单已分配,不允许删除");
//        }
//        AuthorizationUtils.clearAllCachedAuthorizationInfo();
//        return Result.success(menuService.deleteMenuById(menuId));
//    }
//
//    /**
//     * 新增
//     */
//    @PostMapping("/add/{parentId}")
//    public Result<Object> add(@PathVariable("parentId") Long parentId, ModelMap mmap)
//    {
//        SysMenu menu = null;
//        if (0L != parentId)
//        {
//            menu = menuService.selectMenuById(parentId);
//        }
//        else
//        {
//            menu = new SysMenu();
//            menu.setMenuId(0L);
//            menu.setMenuName("主目录");
//        }
//
//        return Result.success( mmap.put("menu", menu));
//    }
//
////    /**
////     * 新增保存菜单
////     */
////    @PostMapping("/add")
////    @ResponseBody
////    public Result addSave(@Validated com.ruoyi.common.core.domain.entity.SysMenu menu)
////    {
////        if (UserConstants.MENU_NAME_NOT_UNIQUE.equals(menuService.checkMenuNameUnique(menu)))
////        {
////            return error("新增菜单'" + menu.getMenuName() + "'失败，菜单名称已存在");
////        }
////        menu.setCreateBy(getLoginName());
////        AuthorizationUtils.clearAllCachedAuthorizationInfo();
////        return toAjax(menuService.insertMenu(menu));
////    }
//
//    /**
//     * 修改菜单
//     */
//    @PostMapping("/edit/{menuId}")
//    public String edit(@PathVariable("menuId") Long menuId, ModelMap mmap)
//    {
//        mmap.put("menu", menuService.selectMenuById(menuId));
//        return "success";
//    }
//
////    /**
////     * 修改保存菜单
////     */
////    @PostMapping("/edit")
////    @ResponseBody
////    public AjaxResult editSave(@Validated com.ruoyi.common.core.domain.entity.SysMenu menu)
////    {
////        if (UserConstants.MENU_NAME_NOT_UNIQUE.equals(menuService.checkMenuNameUnique(menu)))
////        {
////            return error("修改菜单'" + menu.getMenuName() + "'失败，菜单名称已存在");
////        }
////        menu.setUpdateBy(getLoginName());
////        AuthorizationUtils.clearAllCachedAuthorizationInfo();
////        return toAjax(menuService.updateMenu(menu));
////    }
//
//    /**
//     * 选择菜单图标
//     */
//    @GetMapping("/icon")
//    public String icon()
//    {
//        return "/icon";
//    }
//
////    /**
////     * 校验菜单名称
////     */
////    @PostMapping("/checkMenuNameUnique")
////    @ResponseBody
////    public String checkMenuNameUnique(SysMenu menu)
////    {
////        return menuService.checkMenuNameUnique(menu);
////    }
//
//    /**
//     * 加载角色菜单列表树
//     */
//    @GetMapping("/roleMenuTreeData")
//    @ResponseBody
//    public List<Ztree> roleMenuTreeData(SysRole role)
//    {
//        Long userId = ShiroUtils.getUserId();
//        List<Ztree> ztrees = menuService.roleMenuTreeData(role, userId);
//        return ztrees;
//    }
//
//    /**
//     * 加载所有菜单列表树
//     */
//    @GetMapping("/menuTreeData")
//    @ResponseBody
//    public List<Ztree> menuTreeData()
//    {
//        Long userId = ShiroUtils.getUserId();
//        List<Ztree> ztrees = menuService.menuTreeData(userId);
//        return ztrees;
//    }
//
//    /**
//     * 选择菜单树
//     */
//    @PostMapping("/selectMenuTree/{menuId}")
//    public String selectMenuTree(@PathVariable("menuId") Long menuId, ModelMap mmap)
//    {
//        mmap.put("menu", menuService.selectMenuById(menuId));
//        return "/tree";
//    }
//}