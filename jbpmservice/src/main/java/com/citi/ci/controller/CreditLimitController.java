package com.citi.ci.controller;

import com.citi.ci.model.dto.ApplicationRes;
import com.citi.ci.model.dto.BaseResult;
import com.citi.ci.service.ApplicationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/24.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@RestController
@RequestMapping(value = "creditlimit")
public class CreditLimitController {
    @Autowired
    ApplicationService applicationService;
    @ApiOperation(value = "inquiry applicaiton status ")
    @RequestMapping(value = "/{applicationid}/status",method = RequestMethod.GET)
    public ApplicationRes statusInquiry(@PathVariable String applicationId){
        return applicationService.statusInquiry("");
    }
    @RequestMapping(value = "/temporaryIncrease", method = RequestMethod.GET)
    public BaseResult<ApplicationRes> permanentIncrease(){
        BaseResult result =  new BaseResult();
        result.setCode("0");
        result.setMessgae("success");
        ApplicationRes applicationRes = new ApplicationRes("201807310121212165",7,28);
        result.setData(applicationRes);
        return result;
    }
}
