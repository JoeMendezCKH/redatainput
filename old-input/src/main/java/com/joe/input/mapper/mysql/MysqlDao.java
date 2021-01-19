package com.joe.input.mapper.mysql;


import com.joe.input.model.*;
import com.joe.input.model.ItClinicMaster;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Joe
 * @since 2020/3/10 13:40
 */
@Component
public interface MysqlDao {


    @Insert("INSERT INTO it_clinic_master(VISIT_DATE, VISIT_NO,CLINIC_LABEL,VISIT_TIME_DESC,SERIAL_NO,PATIENT_ID,NAME,NAME_PHONETIC,SEX,AGE,IDENTITY,CHARGE_TYPE,INSURANCE_TYPE,INSURANCE_NO,UNIT_IN_CONTRACT,CLINIC_TYPE,FIRST_VISIT_INDICATOR,VISIT_DEPT,VISIT_SPECIAL_CLINIC,DOCTOR,MR_PROVIDE_INDICATOR,REGISTRATION_STATUS,REGISTERING_DATE,SYMPTOM,REGIST_FEE,CLINIC_FEE,OTHER_FEE,CLINIC_CHARGE,OPERATOR,RETURNED_DATE,RETURNED_OPERATOR,MODE_CODE,CARD_NAME,CARD_NO,ACCT_DATE_TIME,ACCT_NO,PAY_WAY,MR_PROVIDED_INDICATOR,INVOICE_NO,CLINIC_NO) VALUES(#{visitDate},#{visitNo},#{clinicLabel},#{visitTimeDesc},#{serialNo},#{patientId},#{name},#{namePhonetic},#{sex},#{age},#{identity},#{chargeType},#{insuranceType},#{insuranceNo},#{unitInContract},#{clinicType},#{firstVisitIndicator},#{visitDept},#{visitSpecialClinic},#{doctor},#{mrProvideIndicator},#{registrationStatus},#{registeringDate},#{symptom},#{registFee},#{clinicFee},#{otherFee},#{clinicCharge},#{operator},#{returnedDate},#{returnedOperator},#{modeCode},#{cardName},#{cardNo},#{acctDateTime},#{acctNo},#{payWay},#{mrProvidedIndicator},#{invoiceNo},#{clinicNo})")
    void insertItClinicMaster(ItClinicMaster clinicMaster);

    @Select("select max(VISIT_DATE) from it_clinic_master")
    String getMaxDateItClinicMaster();

    @Select("select count(*) from it_clinic_master")
    int getNumRecordItClinicMaster();

    @Select("SELECT * FROM  it_clinic_master LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "visitDate", column = "VISIT_DATE"),
            @Result(property = "visitNo", column = "VISIT_NO"),
            @Result(property = "clinicLabel", column = "CLINIC_LABEL"),
            @Result(property = "visitTimeDesc", column = "VISIT_TIME_DESC"),
            @Result(property = "serialNo", column = "SERIAL_NO"),
            @Result(property = "patientId", column = "PATIENT_ID"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "namePhonetic", column = "NAME_PHONETIC"),
            @Result(property = "sex", column = "SEX"),
            @Result(property = "age", column = "AGE"),
            @Result(property = "identity", column = "IDENTITY"),
            @Result(property = "chargeType", column = "CHARGE_TYPE"),
            @Result(property = "insuranceType", column = "INSURANCE_TYPE"),
            @Result(property = "insuranceNo", column = "INSURANCE_NO"),
            @Result(property = "unitInContract", column = "UNIT_IN_CONTRACT"),
            @Result(property = "clinicType", column = "CLINIC_TYPE"),
            @Result(property = "firstVisitIndicator", column = "FIRST_VISIT_INDICATOR"),
            @Result(property = "visitDept", column = "VISIT_DEPT"),
            @Result(property = "visitSpecialClinic", column = "VISIT_SPECIAL_CLINIC"),
            @Result(property = "doctor", column = "DOCTOR"),
            @Result(property = "mrProvideIndicator", column = "MR_PROVIDE_INDICATOR"),
            @Result(property = "registrationStatus", column = "REGISTRATION_STATUS"),
            @Result(property = "registeringDate", column = "REGISTERING_DATE"),
            @Result(property = "symptom", column = "SYMPTOM"),
            @Result(property = "registFee", column = "REGIST_FEE"),
            @Result(property = "clinicFee", column = "CLINIC_FEE"),
            @Result(property = "otherFee", column = "OTHER_FEE"),
            @Result(property = "clinicCharge", column = "CLINIC_CHARGE"),
            @Result(property = "operator", column = "OPERATOR"),
            @Result(property = "returnedDate", column = "RETURNED_DATE"),
            @Result(property = "returnedOperator", column = "RETURNED_OPERATOR"),
            @Result(property = "modeCode", column = "MODE_CODE"),
            @Result(property = "cardName", column = "CARD_NAME"),
            @Result(property = "cardNo", column = "CARD_NO"),
            @Result(property = "acctDateTime", column = "ACCT_DATE_TIME"),
            @Result(property = "acctNo", column = "ACCT_NO"),
            @Result(property = "payWay", column = "PAY_WAY"),
            @Result(property = "mrProvidedIndicator", column = "MR_PROVIDED_INDICATOR"),
            @Result(property = "invoiceNo", column = "INVOICE_NO"),
            @Result(property = "clinicNo", column = "CLINIC_NO"),
    })
    List<ItClinicMaster> getAllItClinicMatser(@Param("pageSize") int pageSize, @Param("page") int page);


    // ExamItemDict
    @Insert("INSERT INTO it_exam_item_dict (ITEM_CODE ,ITEM_NAME, INPUT_CODE) VALUES(#{itemCode}, #{itemName}, #{inputCode})")
    void insertExamItemDict(ItExamItemDict examItemDict);

    @Update("TRUNCATE it_exam_item_dict ")
    void deleteExamItemDict();

    /*分页
    @Select("SELECT * FROM  it_exam_item_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "itemCode", column = "ITEM_CODE"),
            @Result(property = "itemName", column = "ITEM_NAME"),
            @Result(property = "inputCode", column = "INPUT_CODE")
    })
    List<ExamItemDict> getAllExamItemDict(@Param("pageSize") int pageSize, @Param("page") int page);*/

    // VLabItemDict
    @Insert("INSERT INTO it_v_lab_item_dict (ITEM_CODE ,ITEM_NAME, INPUT_CODE) VALUES(#{itemCode}, #{itemName}, #{inputCode})")
    void insertVLabItemDict(ItVLabItemDict vLabItemDict);

    @Update("TRUNCATE it_v_lab_item_dict ")
    void deleteVLabItemDict();


    // ClinicItemDict
    @Select("SELECT * FROM  it_clinic_item_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "itemClass", column = "ITEM_CLASS"),
            @Result(property = "itemCode", column = "ITEM_CODE"),
            @Result(property = "itemName", column = "ITEM_NAME"),
            @Result(property = "inputCode", column = "INPUT_CODE"),
            @Result(property = "expand1", column = "EXPAND1"),
            @Result(property = "expand2", column = "EXPAND2"),
            @Result(property = "expand3", column = "EXPAND3"),
            @Result(property = "expand4", column = "EXPAND4"),
            @Result(property = "expand5", column = "EXPAND5"),
            @Result(property = "itemStatus", column = "ITEM_STATUS"),
    })
    List<ItClinicItemDict> getAllClinicItemDict(@Param("pageSize") int pageSize, @Param("page") int page);

    @Insert("INSERT INTO it_clinic_item_dict (ITEM_CLASS,ITEM_CODE,ITEM_NAME,INPUT_CODE,EXPAND1,EXPAND2,EXPAND3,EXPAND4,EXPAND5,ITEM_STATUS) VALUES(#{itemClass}, #{itemCode},#{itemName},#{inputCode},#{expand1},#{expand2},#{expand3},#{expand4},#{expand5},#{itemStatus})")
    void insertClinicItemDict(ItClinicItemDict clinicItemDict);

    @Select("SELECT ITEM_CODE FROM it_clinic_item_dict LIMIT #{page}, #{pageSize}")
    List<String> getKeyClinicItemDict(@Param("pageSize") int pageSize, @Param("page") int page);

    @Update("TRUNCATE it_clinic_item_dict ")
    void deleteClinicItemDict();

    // DeptDict
    @Select("SELECT * FROM  it_dept_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "serialNo", column = "SERIAL_NO"),
            @Result(property = "deptCode", column = "DEPT_CODE"),
            @Result(property = "deptName", column = "DEPT_NAME"),
            @Result(property = "deptAlias", column = "DEPT_ALIAS"),
            @Result(property = "clinicAttr", column = "CLINIC_ATTR"),
            @Result(property = "outpOrInp", column = "OUTP_OR_INP"),
            @Result(property = "internalOrSergery", column = "INTERNAL_OR_SERGERY"),
            @Result(property = "inputCode", column = "INPUT_CODE"),
            @Result(property = "position", column = "POSITION"),
            @Result(property = "sign", column = "SIGN"),
            @Result(property = "inputCodeWb", column = "INPUT_CODE_WB"),
            @Result(property = "dispensingCumulate", column = "DISPENSING_CUMULATE"),
            @Result(property = "virtualCabinet", column = "VIRTUAL_CABINET"),
    })
    List<ItDeptDict> getAllDeptDict(@Param("pageSize") int pageSize, @Param("page") int page);

    @Insert("INSERT INTO it_dept_dict (SERIAL_NO,DEPT_CODE,DEPT_NAME,DEPT_ALIAS,CLINIC_ATTR,OUTP_OR_INP,INTERNAL_OR_SERGERY,INPUT_CODE,POSITION,SIGN,INPUT_CODE_WB,DISPENSING_CUMULATE,VIRTUAL_CABINET) VALUES(#{serialNo},#{deptCode},#{deptName},#{deptAlias},#{clinicAttr},#{outpOrInp},#{internalOrSergery},#{inputCode},#{position},#{sign},#{inputCodeWb},#{dispensingCumulate},#{virtualCabinet})")
    void insertDeptDict(ItDeptDict deptDict);

    @Update("TRUNCATE it_dept_dict")
    void deleteDeptDict();

    //DiagnosisDict
    @Select("SELECT * FROM  it_diagnosis_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "diagnosisCode", column = "DIAGNOSIS_CODE"),
            @Result(property = "diagnosisName", column = "DIAGNOSIS_NAME"),
            @Result(property = "stdIndicator", column = "STD_INDICATOR"),
            @Result(property = "approvedIndicator", column = "APPROVED_INDICATOR"),
            @Result(property = "createDate", column = "CREATE_DATE"),
            @Result(property = "inputCode", column = "INPUT_CODE"),
            @Result(property = "inputCodeWb", column = "INPUT_CODE_WB"),
            @Result(property = "diagIndicator", column = "DIAG_INDICATOR"),
    })
    List<ItDiagnosisDict> getAllDiagnosisDict(@Param("pageSize") int pageSize, @Param("page") int page);

    @Insert("INSERT INTO it_diagnosis_dict (DIAGNOSIS_CODE,DIAGNOSIS_NAME,STD_INDICATOR,APPROVED_INDICATOR,CREATE_DATE,INPUT_CODE,INPUT_CODE_WB,DIAG_INDICATOR) VALUES(#{diagnosisCode},#{diagnosisName},#{stdIndicator},#{approvedIndicator},#{createDate},#{inputCode},#{inputCodeWb},#{diagIndicator})")
    void insertDiagnosisDict(ItDiagnosisDict diagnosisDict);

    @Select("SELECT DIAGNOSIS_CODE FROM  it_diagnosis_dict LIMIT #{page}, #{pageSize}")
    List<String> getKeyDiagnosisDict(@Param("pageSize") int pageSize, @Param("page") int page);

    @Select("select max(CREATE_DATE) from it_diagnosis_dict")
    String getMaxDateDiagnosisDict();

    @Select("select count(*) from it_diagnosis_dict")
    int getNumRecordDiagnosisDict();

    // StaffDict

    @Update("TRUNCATE it_staff_dict ")
    void truncateStaffDict();

    @Select("select count(*) from it_staff_dict")
    int getNumStaffDict();

    @Select("select max(CREATE_DATE) from it_staff_dict")
    String getMaxDateStaffDict();

    @Insert("INSERT INTO it_staff_dict (DEPT_CODE,NAME, INPUT_CODE,EMP_NO,JOB,TITLE,USER_NAME,INPUT_CODE_WB,ID,PASSWORD,CREATE_DATE) " +
            " VALUES(#{deptCode}, #{name}, #{inputCode},#{empNo},#{job},#{title},#{userName},#{inputCodeWb},#{id},#{password},#{createDate})")
    void insetStaffDict(ItStaffDict staffDict);

    @Select("SELECT count(*) from it_staff_dict WHERE id=#{staffId}")
    int isExistedStaff(@Param("staffId") String staffId);

    @Delete("delete from it_staff_dict where id=#{staffId}")
    void delStaffById(@Param("staffId") String staffId);

    // DrugDict
    @Insert("INSERT INTO it_drug_dict (DRUG_CODE,DRUG_NAME, DRUG_SPEC,UNITS,DRUG_FORM,TOXI_PROPERTY,DOSE_PER_UNIT,DOSE_UNITS,DRUG_INDICATOR,INPUT_CODE,OTC,LIMIT_CLASS,STOP_FLAG,ENTERED_DATETIME) " +
            " VALUES(#{drugCode}, #{drugName}, #{drugSpec},#{units},#{drugForm},#{toxiProperty},#{dosePerUnit},#{doseUnits},#{drugIndicator},#{inputCode},#{otc},#{limitClass},#{stopFlag},#{enteredDatetime})")
    void insertDrugDict(ItDrugDict drugDict);

    @Update("TRUNCATE it_drug_dict")
    void truncateDrugDict();

    @Select("select count(*) from it_drug_dict")
    int getNumDrugDict();

    @Select("select max(ENTERED_DATETIME) from it_drug_dict")
    String getMaxTimeDrugDict();

    @Select("SELECT count(*) from it_drug_dict WHERE DRUG_CODE=#{drugCode} and DRUG_SPEC=#{drugSpec}")
    int isExistedDict(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec);

    @Delete("delete from it_drug_dict WHERE DRUG_CODE=#{drugCode} and DRUG_SPEC=#{drugSpec}")
    void delDrugByCodeAndSpec(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec);

    // DrugPriceList
    @Insert("INSERT INTO it_drug_price_list (DRUG_CODE,DRUG_SPEC, FIRM_ID,UNITS,TRADE_PRICE,RETAIL_PRICE,AMOUNT_PER_PACKAGE,MIN_SPEC,MIN_UNITS,START_DATE,STOP_DATE,MEMOS,CLASS_ON_INP_RCPT,CLASS_ON_OUTP_RCPT,CLASS_ON_RECKONING,SUBJ_CODE,CLASS_ON_MR,HLIMIT_PRICE,PRICE_CLASS,PASS_NO,GMP) " +
            " VALUES(#{drugCode}, #{drugSpec}, #{firmId},#{units},#{tradePrice},#{retailPrice},#{amountPerPackage},#{minSpec},#{minUnits},#{startDate},#{stopDate},#{memos},#{classOnInpRcpt},#{classOnOutpRcpt},#{classOnReckoning},#{subjCode},#{classOnMr},#{hlimitPrice},#{priceClass},#{passNo},#{gmp})")
    void insertDrugPriceList(ItDrugPriceList drugPriceList);

    @Update("TRUNCATE it_drug_price_list")
    void truncateDrugPriceList();

    // PatMasterIndex
    @Select("SELECT * FROM  it_pat_master_index LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "patientId", column = "PATIENT_ID"),
            @Result(property = "inpNo", column = "INP_NO"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "namePhonetic", column = "NAME_PHONETIC"),
            @Result(property = "sex", column = "SEX"),
            @Result(property = "dateOfBirth", column = "DATE_OF_BIRTH"),
            @Result(property = "birthPlace", column = "BIRTH_PLACE"),
            @Result(property = "citizenship", column = "CITIZENSHIP"),
            @Result(property = "nation", column = "NATION"),
            @Result(property = "idNo", column = "ID_NO"),
            @Result(property = "identity", column = "IDENTITY"),
            @Result(property = "chargeType", column = "CHARGE_TYPE"),
            @Result(property = "unitInContract", column = "UNIT_IN_CONTRACT"),
            @Result(property = "mailingAddress", column = "MAILING_ADDRESS"),
            @Result(property = "zipCode", column = "ZIP_CODE"),
            @Result(property = "phoneNumberHome", column = "PHONE_NUMBER_HOME"),
            @Result(property = "phoneNumberBusiness", column = "PHONE_NUMBER_BUSINESS"),
            @Result(property = "nextOfKin", column = "NEXT_OF_KIN"),
            @Result(property = "relationship", column = "RELATIONSHIP"),
            @Result(property = "nextOfKinAddr", column = "NEXT_OF_KIN_ADDR"),
            @Result(property = "nextOfKinPhone", column = "NEXT_OF_KIN_PHONE"),
            @Result(property = "vipIndicator", column = "VIP_INDICATOR"),
            @Result(property = "createDate", column = "CREATE_DATE"),
            @Result(property = "operator", column = "OPERATOR"),
            @Result(property = "photo", column = "PHOTO"),
            @Result(property = "patientClass", column = "PATIENT_CLASS"),
    })
    List<ItPatMasterIndex> getAllPatMasterIndex(@Param("pageSize") int pageSize, @Param("page") int page);


    @Insert("INSERT INTO it_pat_master_index (PATIENT_ID,INP_NO, NAME,NAME_PHONETIC,SEX,DATE_OF_BIRTH,BIRTH_PLACE,CITIZENSHIP,NATION,ID_NO,IDENTITY,CHARGE_TYPE,UNIT_IN_CONTRACT,MAILING_ADDRESS,ZIP_CODE,PHONE_NUMBER_HOME,PHONE_NUMBER_BUSINESS,NEXT_OF_KIN,RELATIONSHIP,NEXT_OF_KIN_ADDR,NEXT_OF_KIN_PHONE,VIP_INDICATOR,CREATE_DATE,OPERATOR,PHOTO,PATIENT_CLASS) " +
            " VALUES(#{patientId}, #{inpNo}, #{name},#{namePhonetic},#{sex},#{dateOfBirth},#{birthPlace},#{citizenship},#{nation},#{idNo},#{identity},#{chargeType},#{unitInContract},#{mailingAddress},#{zipCode},#{phoneNumberHome},#{phoneNumberBusiness},#{nextOfKin},#{relationship},#{nextOfKinAddr},#{nextOfKinPhone},#{vipIndicator},#{createDate},#{operator},#{photo},#{patientClass})")
    void insertPatMasterIndex(ItPatMasterIndex patMasterIndex);

    @Select("select max(CREATE_DATE) from it_pat_master_index")
    String getMaxDatePatMasterIndex();

    @Select("select count(*) from it_pat_master_index")
    int getNumRecordPatMasterIndex();

    @Select("select count(*) from it_pat_master_index where PATIENT_ID = #{patientId}")
    int patMasterIndexIsExisted(String patientId);

    @Delete("delete from it_pat_master_index where PATIENT_ID = #{patientId}")
    void delPatMasterIndex(String patientId);
}
