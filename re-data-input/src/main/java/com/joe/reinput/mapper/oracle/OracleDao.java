package com.joe.reinput.mapper.oracle;


import com.joe.reinput.model.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Joe
 * @since 2021/1/18 13:40
 */
@Component
public interface OracleDao {

    // VLabItemDict
    @Select("SELECT * FROM  it_v_lab_item_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "itemCode", column = "ITEM_CODE"),
            @Result(property = "itemName", column = "ITEM_NAME"),
            @Result(property = "inputCode", column = "INPUT_CODE")
    })
    List<ItVLabItemDict> getAllVLabItemDict(@Param("page") int page, @Param("pageSize") int pageSize);

    // ExamItemDict
    @Select("SELECT * FROM  it_exam_item_dict LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "itemCode", column = "ITEM_CODE"),
            @Result(property = "itemName", column = "ITEM_NAME"),
            @Result(property = "inputCode", column = "INPUT_CODE")
    })
    List<ItExamItemDict> getAllExamItemDict(@Param("page") int page, @Param("pageSize") int pageSize);

    // ClinicMaster
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM CLINIC_MASTER t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin} and VISIT_DATE > to_date(#{datetime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT * FROM  it_clinic_master where VISIT_DATE > #{datetime} LIMIT #{page}, #{pageSize}")
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
    List<ItClinicMaster> getAllClinicMaster(@Param("page") int page, @Param("pageSize") int pageSize, @Param("datetime") String datetime);

    @Select("SELECT COUNT(*) FROM it_clinic_master")
    int getCountClinicMaster();


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
    List<ItClinicItemDict> getAllClinicItemDict(@Param("page") int page, @Param("pageSize") int pageSize);

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
    List<ItDeptDict> getAllDeptDict(@Param("page") int page, @Param("pageSize") int pageSize);

    // DiagnosisDict
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM  DIAGNOSIS_DICT t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin} and CREATE_DATE > to_date(#{datetime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT * FROM  it_diagnosis_dict WHERE CREATE_DATE > #{datetime} LIMIT #{page}, #{pageSize}")
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
    List<ItDiagnosisDict> getAllDiagnosisDict(@Param("page") int page, @Param("pageSize") int pageSize, @Param("datetime") String datetime);

    @Select("select count(*) from it_diagnosis_dict")
    int getCountDiagnosisDict();

    //DrugDict
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM  DRUG_DICT t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin} and ENTERED_DATETIME > to_date(#{maxTime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT * FROM  it_drug_dict WHERE ENTERED_DATETIME > #{maxTime} LIMIT #{page}, #{pageSize}")
    @Results(id = "drugDict", value = {
            @Result(property = "drugCode", column = "DRUG_CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "drugName", column = "DRUG_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "drugSpec", column = "DRUG_SPEC", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "units", column = "UNITS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "drugForm", column = "DRUG_FORM", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "toxiProperty", column = "TOXI_PROPERTY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "dosePerUnit", column = "DOSE_PER_UNIT", javaType = Float.class, jdbcType = JdbcType.FLOAT),
            @Result(property = "doseUnits", column = "DOSE_UNITS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "drugIndicator", column = "DRUG_INDICATOR", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "inputCode", column = "INPUT_CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "otc", column = "OTC", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "limitClass", column = "LIMIT_CLASS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "stopFlag", column = "STOP_FLAG", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "enteredDatetime", column = "ENTERED_DATETIME", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
    })
    List<ItDrugDict> getAllDrugDict(@Param("page") int page, @Param("pageSize") int pageSize, @Param("maxTime") String maxTime);

    @Select("select count(*) from it_drug_dict")
    int getCountDrugDict();


    // DrugPriceList
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM  DRUG_PRICE_LIST t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin}")
    @Select("SELECT * FROM  it_drug_price_list  LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "drugCode", column = "DRUG_CODE"),
            @Result(property = "drugSpec", column = "DRUG_SPEC"),
            @Result(property = "firmId", column = "FIRM_ID"),
            @Result(property = "units", column = "UNITS"),
            @Result(property = "tradePrice", column = "TRADE_PRICE"),
            @Result(property = "retailPrice", column = "RETAIL_PRICE"),
            @Result(property = "amountPerPackage", column = "AMOUNT_PER_PACKAGE"),
            @Result(property = "minSpec", column = "MIN_SPEC"),
            @Result(property = "minUnits", column = "MIN_UNITS"),
            @Result(property = "startDate", column = "START_DATE"),
            @Result(property = "stopDate", column = "STOP_DATE"),
            @Result(property = "memos", column = "MEMOS"),
            @Result(property = "classOnInpRcpt", column = "CLASS_ON_INP_RCPT"),
            @Result(property = "classOnOutpRcpt", column = "CLASS_ON_OUTP_RCPT"),
            @Result(property = "classOnReckoning", column = "CLASS_ON_RECKONING"),
            @Result(property = "subjCode", column = "SUBJ_CODE"),
            @Result(property = "classOnMr", column = "CLASS_ON_MR"),
            @Result(property = "hlimitPrice", column = "HLIMIT_PRICE"),
            @Result(property = "priceClass", column = "PRICE_CLASS"),
            @Result(property = "passNo", column = "PASS_NO"),
            @Result(property = "gmp", column = "GMP"),
    })
    List<ItDrugPriceList> getAllDrugPriceList(@Param("page") int page, @Param("pageSize") int pageSize);


    // PatMasterIndex
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM  PAT_MASTER_INDEX t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin} and CREATE_DATE > to_date(#{datetime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT * FROM  it_pat_master_index WHERE CREATE_DATE > #{datetime}  LIMIT #{page}, #{pageSize}")
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
    List<ItPatMasterIndex> getAllPatMasterIndex(@Param("page") int page, @Param("pageSize") int pageSize, @Param("datetime") String datetime);

    @Select("select count(*) from it_pat_master_index")
    int getCountPatMasterIndex();

    // StaffDict
//    @Select("SELECT a.* FROM ( SELECT ROWNUM rowno, t.* FROM STAFF_DICT t WHERE ROWNUM <= #{end} ) a WHERE a.rowno > #{begin} and CREATE_DATE > to_date(#{maxTime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT * FROM  it_staff_dict WHERE CREATE_DATE > #{maxTime}  LIMIT #{page}, #{pageSize}")
    @Results({
            @Result(property = "deptCode", column = "DEPT_CODE"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "inputCode", column = "INPUT_CODE"),
            @Result(property = "empNo", column = "EMP_NO"),
            @Result(property = "job", column = "JOB"),
            @Result(property = "title", column = "TITLE"),
            @Result(property = "userName", column = "USER_NAME"),
            @Result(property = "inputCodeWb", column = "INPUT_CODE_WB"),
            @Result(property = "id", column = "ID"),
            @Result(property = "password", column = "PASSWORD"),
            @Result(property = "createDate", column = "CREATE_DATE"),
    })
    List<ItStaffDict> getAllStaffDict(@Param("page") int page, @Param("pageSize") int pageSize, @Param("maxTime") String maxTime);

    //    @Select("select count(*) from it_staff_dict WHERE CREATE_DATE> to_date(#{maxTime}, 'yyyy-MM-dd HH24:MI:SS')")
    @Select("SELECT count(*)  FROM  it_staff_dict WHERE CREATE_DATE > #{maxTime}")
    int getCountStaffDict(@Param("maxTime") String maxTime);


}
