package com.katoumori.architecture.http;

 /**
  * @Title: BaseResponse
  * @Package com.katoumori.architecture.http
  * @Description: 实际业务返回的固定字段, 根据需求来定义，
  * @author yzl10
  * @date 2021/9/4
  * @version V1.0
  */
public class BaseResponse<T> {
    private int code;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isOk() {
        return code == 0;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
