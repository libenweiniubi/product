//package com.calb.es.controller;
//
//import com.calb.es.model.Result;
//import com.calb.es.utils.StringUtils;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 登录验证
// *
// * @author ruoyi
// */
//@Controller
//public class SysLoginController
//{
//    /**
//     * 是否开启记住我功能
//     */
//    @Value("${shiro.ini.rememberMe.enabled: false}")
//    private boolean rememberMe;
//
////    @Autowired
////    private ConfigService configService;
//
//    @GetMapping("/login")
//    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap mmap)
//    {
////        // 如果是Ajax请求，返回Json字符串。
////        if (ServletUtils.isAjaxRequest(request))
////        {
////            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
////        }
//        // 是否开启记住我
//        mmap.put("isRemembered", rememberMe);
//        // 是否开启用户注册
////        mmap.put("isAllowRegister", Convert.toBool(configService.getKey("sys.account.registerUser"), false));
//        return "login";
//    }
//
//    @PostMapping("/login")
//    @ResponseBody
//    public Result ajaxLogin(String username, String password, Boolean rememberMe)
//    {
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
//        Subject subject = SecurityUtils.getSubject();
//        System.out.println("----------------------");
//        System.out.println(subject);
//        try
//        {
//            subject.login(token);
//            return Result.success(token);
//        }
//        catch (AuthenticationException e)
//        {
//            String msg = "用户或密码错误";
//            if (StringUtils.isNotEmpty(e.getMessage()))
//            {
//                msg = e.getMessage();
//            }
//            return Result.error(405,msg);
//        }
//    }
//
//    @GetMapping("/unauth")
//    public String unauth()
//    {
//        return "error/unauth";
//    }
//}
