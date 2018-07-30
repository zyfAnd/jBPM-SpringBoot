package com.citi.ci.service;

import com.citi.ci.model.dto.ApplicationRes;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public interface ApplicationService {
    ApplicationRes statusInquiry(String applicationId);
}

