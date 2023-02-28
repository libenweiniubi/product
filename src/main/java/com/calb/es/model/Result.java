package com.calb.es.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一返回结果的实体
 * @param <T>
 */
@Data
/**生成一个无参数的构造方法**/
@NoArgsConstructor
/**生成一个包含所有变量的构造方法**/
@AllArgsConstructor
public class Result<T> implements Serializable {
    /**
     * 错误码
     */
    private int code;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 返回的数据体
     */
    private T data;

    public Result(T data) {
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data) {
        Result result = new Result(1,"success");
        result.setData(data);
        return result;
    }

    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(int code, String msg) {
        return new Result<T>(code, msg);
    }
}


