package com.calb.es.shiro.config.exception;

/**
 * @author heeexy
 * @description: 未登录的异常
 */
public class UnauthenticatedException extends RuntimeException {
    public UnauthenticatedException() {
        super("未登录");
    }
}
