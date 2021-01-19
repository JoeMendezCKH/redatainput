package com.joe.input.schedule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Joe
 * @since  2021/1/13 13:09
 */

@Component
@PropertySource("classpath:startTime.properties")
public class StartTime {
    @Value("${start.TimeClinicItemDict}")
    String startTimeClinicItemDict;

    @Value("${start.TimeClinicMaster}")
    String startTimeClinicMaster;

    @Value("${start.TimeDeptDict}")
    String startTimeDeptDict;

    @Value("${start.TimeDiagnosisDict}")
    String startTimeDiagnosisDict;

    @Value("${start.TimeDrugDict}")
    String startTimeDrugDict;

    @Value("${start.TimeDrugPriceList}")
    String startTimeDrugPriceList;

    @Value("${start.TimeExamItemDict}")
    String startTimeExamItemDict;

    @Value("${start.TimePatMasterIndex}")
    String startTimePatMasterIndex;

    @Value("${start.TimeStaffDict}")
    String startTimeStaffDict;

    @Value("${start.TimeVLabItemDict}")
    String startTimeVLabItemDict;
}
