package com.citi.ci.model.dto;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class ApplicationRes {
    private String applicationId;
    private Integer status;
    private Integer stage;

    public ApplicationRes() {
    }

    public ApplicationRes(String applicationId, Integer status, Integer stage) {
        this.applicationId = applicationId;
        this.status = status;
        this.stage = stage;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }
}
