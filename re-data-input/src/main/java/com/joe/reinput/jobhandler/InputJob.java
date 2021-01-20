package com.joe.reinput.jobhandler;

import com.joe.reinput.service.DataService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

/**
 * @author ckh
 * @since 2021/1/20
 */
@Component
public class InputJob {

    @Resource
    DataService service;

    @XxlJob("ClinicItemDict")
    public ReturnT<String> ClinicItemDict(String param) throws Exception {
        String errorMsg = service.clinicItemDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("DeptDict")
    public ReturnT<String> DeptDict(String param) throws Exception {
        String errorMsg = service.deptDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("VLabItemDict")
    public ReturnT<String> VLabItemDict(String param) throws Exception {
        String errorMsg = service.vLabItemDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("DrugPriceList")
    public ReturnT<String> DrugPriceList(String param) throws Exception {
        String errorMsg = service.drugPriceList();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("ExamItemDict")
    public ReturnT<String> ExamItemDict(String param) throws Exception {
        String errorMsg = service.examItemDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("ClinicMaster")
    public ReturnT<String> ClinicMaster(String param) throws Exception {
        String errorMsg = service.clinicMaster();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("DiagnosisDict")
    public ReturnT<String> DiagnosisDict(String param) throws Exception {
        String errorMsg = service.diagnosisDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("StaffDict")
    public ReturnT<String> StaffDict(String param) throws Exception {
        String errorMsg = service.staffDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("DrugDict")
    public ReturnT<String> DrugDict(String param) throws Exception {
        String errorMsg = service.drugDict();
        return new ReturnT<>(200, errorMsg);
    }

    @XxlJob("PatMasterIndex")
    public ReturnT<String> PatMasterIndex(String param) throws Exception {
        String errorMsg = service.patMasterIndex();
        return new ReturnT<>(200, errorMsg);
    }


}
