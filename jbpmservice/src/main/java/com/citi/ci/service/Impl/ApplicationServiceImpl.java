package com.citi.ci.service.Impl;

import com.citi.ci.model.dto.ApplicationRes;
import com.citi.ci.service.ApplicationService;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public ApplicationRes statusInquiry(String applicationId) {
        ApplicationRes applicationRes = new ApplicationRes();
        applicationRes.setApplicationId("2018072300000");
        applicationRes.setStage(28);
        applicationRes.setStatus(71);
        return applicationRes;
    }
}
