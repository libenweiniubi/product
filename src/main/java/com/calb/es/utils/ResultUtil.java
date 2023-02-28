package com.calb.es.utils;


import com.calb.es.model.Result;

/**
 * 生成result的工具类，避免重复代码
 */
public class ResultUtil {

    /**
     * 成功时生成result的方法,有返回数据
     */
    public static <T> Object success(T t){
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(t);
        return result;
    }

    /**
     * 成功时生成result的方法,无返回数据
     */
    public static <T> Result<T> success(){
        return (Result<T>) success(null);
    }

    /**
     * 失败时生成result的方法
     */
    public static <T> T error(int code, String msg){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return (T) result;
    }
}
