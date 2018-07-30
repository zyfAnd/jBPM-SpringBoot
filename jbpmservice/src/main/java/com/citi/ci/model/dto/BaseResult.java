package com.citi.ci.model.dto;

import com.citi.ci.model.Base.BaseModel;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class BaseResult<T> extends BaseModel {
    private String code;
    private String messgae;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
