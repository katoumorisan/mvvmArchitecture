package com.katoumori.architecture.http;

/**
 * @Title: ResponseThrowable
 * @Package com.katoumori.architecture.http
 * @Description: ResponseThrowable
 * @author yzl10
 * @date 2021/9/4
 * @version V1.0
 */
public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
