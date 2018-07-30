package com.citi.ci.model.Base;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class BaseResult<T> extends BaseModel {
    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
