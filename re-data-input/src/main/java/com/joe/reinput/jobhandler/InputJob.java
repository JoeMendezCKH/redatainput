package com.joe.reinput.jobhandler;

import com.joe.reinput.service.DataInputJobsService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ckh
 * @since 2021/1/20
 */
@Component
public class InputJob {

    @Resource
    DataInputJobsService service;

    @XxlJob("ClinicItemDict")
    public ReturnT<String> ClinicItemDict(String param) throws Exception {
        XxlJobLogger.log(" ClinicItemDict 任务开始");
        System.out.println("param = " + param);

        String errorMsg = service.clinicItemDict();
        if (errorMsg.length() == 0) {
            return ReturnT.SUCCESS;
        } else {
            return new ReturnT<>(400, errorMsg);
        }
    }
}
