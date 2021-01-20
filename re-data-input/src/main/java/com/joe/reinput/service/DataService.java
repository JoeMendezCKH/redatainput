package com.joe.reinput.service;


import com.joe.reinput.mapper.mysql.MysqlMapper;
import com.joe.reinput.mapper.oracle.OracleMapper;
import com.joe.reinput.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 该类的所有方法签名必须是
 * public String xxxxxx()
 * 返回值是任务执行的错误信息, 没有则返回空字符串
 *
 * @author ckh
 * @since 2021/1/19
 */
@SuppressWarnings("UnusedReturnValue")
@Service
public class DataService {
    private static final Logger log = LoggerFactory.getLogger(DataService.class);
    private static final int PAGESHOW = 1000;
    private static final int SIZE = Integer.MAX_VALUE;

    @Resource
    OracleMapper oracleMapper;

    @Resource
    MysqlMapper mysqlMapper;


    /**
     * 字典表，删除了重新导入, 从第一页开始
     */

    public String vLabItemDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            //删除 mysql 原有数据
            mysqlMapper.deleteVLabItemDict();
            log.info("===> VLabItemDict 旧数据删除完成");
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItVLabItemDict> oracleList = oracleMapper.getAllVLabItemDict(begin, PAGESHOW);
                if (oracleList.size() == 0) break;
                // 当前页插入 mysql
                oracleList
                        .forEach(vLabItemDict -> {
                            try {
                                mysqlMapper.insertVLabItemDict(vLabItemDict);
                            } catch (Exception e) {
                                errorMsg.append(e.getMessage()).append("\n");
                            }
                        });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }


    public String clinicMaster() {
        //记录异常
        StringBuilder errorMsg = new StringBuilder();
        try {
            //记录mysql数据库的记录数量
            int index = mysqlMapper.getNumRecordItClinicMaster();
            String maxDate;
            if (index != 0) {
                maxDate = mysqlMapper.getMaxDateItClinicMaster();
            } else {
                maxDate = "1972-10-10 10:10:10";
            }
            log.info("ClinicMaster mysql 中最大时间为：" + maxDate);
            int size = (oracleMapper.getCountClinicMaster() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                // 获取指定范围内 大于 datetime 的数据
                List<ItClinicMaster> oracleList = oracleMapper.getAllClinicMaster(begin, PAGESHOW, maxDate);
                if (oracleList.size() == 0) continue;

                // 884312 条数据
                // 数据量过大,采用估算, 18min导入了12929 条, 估计需要1224min 也就是20h
                // 换为并行流后, 约 3min导入10694,  估计需要 246 min 也就是 4h
                // 经实际测试后发现, 跑完需要 6h
                oracleList.parallelStream().forEach(clinicMaster -> {
                    try {
                        mysqlMapper.insertItClinicMaster(clinicMaster);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }

    public String clinicItemDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            //删除mysql中已有数据
            mysqlMapper.deleteClinicItemDict();
//            XxlJobLogger.log("ClinicItemDict 旧数据删除完成");
            log.info("ClinicItemDict 旧数据删除完成");
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItClinicItemDict> oracleList = oracleMapper.getAllClinicItemDict(begin, PAGESHOW);
                //当前页为空跳出循环
                if (oracleList.size() == 0) break;

                // 9240 条数据
                // 12.08min
//                oracleList.forEach(clinicItemDict -> {
//                    try {
//                        mysqlDao.insertClinicItemDict(clinicItemDict);
//                    } catch (Exception e) {
//                        errorMsg.append(e.getMessage()).append("\n");
//                    }
//                });
                // 3.27 min
                oracleList.parallelStream().forEach(
                        clinicItemDict -> {
                            try {
                                mysqlMapper.insertClinicItemDict(clinicItemDict);
                            } catch (Exception e) {
                                errorMsg.append(e.getMessage()).append("\n");
                            }
                        }
                );
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }

    public String deptDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            //删除mysql中数据
            mysqlMapper.deleteDeptDict();
            log.info("DeptDict 旧数据删除完成");
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                //分页取出oracle中数据
                List<ItDeptDict> oracleList = oracleMapper.getAllDeptDict(begin, PAGESHOW);
                if (oracleList.size() == 0) break;


                oracleList.parallelStream()
                        .forEach(deptDict -> {
                            try {
                                mysqlMapper.insertDeptDict(deptDict);
                            } catch (Exception e) {
                                errorMsg.append(e.getMessage()).append("\n");
                            }
                        });

            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }

    }

    public String diagnosisDict() {
        //记录异常
        StringBuilder errorMsg = new StringBuilder();
        try {
            //记录MYSQL数据库的记录数量
            int index = mysqlMapper.getNumRecordDiagnosisDict();
            //记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlMapper.getMaxDateDiagnosisDict();
            } else {
                maxTime = "1972-10-10 10:10:10";
            }
            log.info("DiagnosisDict mysql当前最大时间：" + maxTime);
            int size = (oracleMapper.getCountDiagnosisDict() / PAGESHOW) + 1;
            System.out.println("size = " + size);
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                List<ItDiagnosisDict> oracleList = oracleMapper.getAllDiagnosisDict(begin, PAGESHOW, maxTime);

                if (oracleList.size() == 0) continue;

                // 一共 33229 条数据
                //38.66 min
//                oracleList.forEach(diagnosisDict -> mysqlDao.insertDiagnosisDict(diagnosisDict));
                // 9.72 min  优化 74%
//                oracleList.parallelStream().forEach(diagnosisDict -> mysqlDao.insertDiagnosisDict(diagnosisDict));
                // 12.68 min
//                try {
//                    oracleList.parallelStream().forEach(diagnosisDict -> mysqlDao.insertDiagnosisDict(diagnosisDict));
//                } catch (Exception e) {
//                    log.error("从 第{}页 第{}条 开始的 {} 条数据中存在错误, 跳过", i + 1, begin, PAGESHOW);
//                    errorMsg.append(e.getMessage()).append("\n");
//                }
                // 12.15 min  优化 69% 且有异常处理
                oracleList.parallelStream().forEach(diagnosisDict -> {
                    try {
                        mysqlMapper.insertDiagnosisDict(diagnosisDict);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }

    public String staffDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            // 删除 mysql中原有数据
            // mysqlMapper.truncateStaffDict();
            // log.info("StaffDict delete success");

            int index = mysqlMapper.getNumStaffDict();
            //记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlMapper.getMaxDateStaffDict();
            } else {
                maxTime = "1950-10-10 10:10:10";
            }
            log.info("StaffDict mysql当前最大时间：" + maxTime);

            int size = (oracleMapper.getCountStaffDict(maxTime) / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                //获取当前页数据
                List<ItStaffDict> oracleList = oracleMapper.getAllStaffDict(begin, PAGESHOW, maxTime);
                if (oracleList.size() == 0) continue;

                /* 判断 mysql 中是否存在这些 数据, 如果存在则删除 */
                List<String> idList = oracleList.stream().map(ItStaffDict::getId).collect(Collectors.toList());
                idList.parallelStream().forEach(staffId -> {
                    try {
                        int count = mysqlMapper.isExistedStaff(staffId);
                        if (count != 0) {
                            mysqlMapper.delStaffById(staffId);
                        }
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });

                // 当前页导入mysql
                oracleList.parallelStream().forEach(staffDict -> {
                    try {
                        mysqlMapper.insetStaffDict(staffDict);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }

    public String drugDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            // 删除mysql已有数据
            // mysqlMapper.truncateDrugDict();
            // log.info("DrugDict delete success ");
            int index = mysqlMapper.getNumDrugDict();
            // 记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlMapper.getMaxTimeDrugDict();
            } else {
                maxTime = "1950-10-10 10:10:10";
            }
            log.info("drugDict mysql当前最大时间：" + maxTime);

            int size = (oracleMapper.getCountDrugDict() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                int end = (i + 1) * PAGESHOW;
                //获取当前页数据
                List<ItDrugDict> oracleList = oracleMapper.getAllDrugDict(begin, PAGESHOW, maxTime);
                //当前页为空时，跳出循环
                if (oracleList.size() == 0) continue;


                /* 判断是否存在 */
                List<String> drugDictList = oracleList.parallelStream().map(drug -> {
                    String drugCode = drug.getDrugCode();
                    String drugSpec = drug.getDrugSpec();
                    return drugCode + "-" + drugSpec;
                }).collect(Collectors.toList());

                drugDictList.parallelStream().forEach(drug -> {
                    String[] split = drug.split("-");
                    try {
                        int count = mysqlMapper.isExistedDict(split[0], split[1]);
                        if (count != 0) {
                            mysqlMapper.delDrugByCodeAndSpec(split[0], split[1]);
                        }
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
//                        log.error("split[]-> {}; split[0]-> {}, split[1]-> {}", split, split[0], split[1]);
//                        log.error("drugDictList.parallelStream().forEach, {}", e.getMessage());
                    }
                });


                //当前页导入mysql
                oracleList.parallelStream().forEach(drugDict -> {
                    try {
                        mysqlMapper.insertDrugDict(drugDict);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
//                        log.error("oracleList.stream().parallel" + e.getMessage());
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }


    public String drugPriceList() {
        //声明记录异常信息的变量
        StringBuilder errorMsg = new StringBuilder();
        //删除mysql中原有数据
        mysqlMapper.truncateDrugPriceList();
        log.info("DrugPriceList 旧数据删除完成");
        try {
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                //获取当前页数据
                List<ItDrugPriceList> oracleList = oracleMapper.getAllDrugPriceList(begin, PAGESHOW);
                //当前页为空时，跳出循环
                if (oracleList.size() == 0) break;

                //当前页导入mysql
                oracleList.parallelStream().forEach(drugPriceList -> {
                    try {
                        mysqlMapper.insertDrugPriceList(drugPriceList);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }

    public String patMasterIndex() {
        //记录异常
        StringBuilder errorMsg = new StringBuilder();
        try {
            //记录数据库记录的数量
            int index = mysqlMapper.getNumRecordPatMasterIndex();
            //记录mysql中最大时间
            String matTime;
            if (index != 0) {
                matTime = mysqlMapper.getMaxDatePatMasterIndex();
            } else {
                matTime = "1972-10-10 10:10:10";
            }
            log.info("PatMasterIndex mysql中最大时间为：" + matTime);

            int size = (oracleMapper.getCountPatMasterIndex() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                int end = (i + 1) * PAGESHOW;
                //获取当前页数据
                List<ItPatMasterIndex> oracleList = oracleMapper.getAllPatMasterIndex(begin, PAGESHOW, matTime);
                //当前页为空时，跳出循环
                if (oracleList.size() == 0) continue;


                /* 判断是否存在 */
                List<String> patientIds = oracleList.parallelStream().map(ItPatMasterIndex::getPatientId).collect(Collectors.toList());
                patientIds.parallelStream().forEach(patientId -> {
                    try {
                        int count = mysqlMapper.patMasterIndexIsExisted(patientId);
                        if (count != 0) {
                            mysqlMapper.delPatMasterIndex(patientId);
                        }
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });

                //当前页导入mysql
                oracleList.parallelStream().forEach(patMasterIndex -> {
                    try {
                        mysqlMapper.insertPatMasterIndex(patMasterIndex);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }
    }


    public String examItemDict() {
        StringBuilder errorMsg = new StringBuilder();
        try {
            //删除mysql已有数据
            mysqlMapper.deleteExamItemDict();
            log.info("ExamItemDict 删除完毕");
            //分页导出导入
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItExamItemDict> oracleList = oracleMapper.getAllExamItemDict(begin, PAGESHOW);

                if (oracleList.size() == 0) break;

                oracleList.parallelStream().forEach(examItemDict -> {
                    try {
                        mysqlMapper.insertExamItemDict(examItemDict);
                    } catch (Exception e) {
                        errorMsg.append(e.getMessage()).append("\n");
                    }
                });
            }
            return errorMsg.toString();
        } catch (Exception e) {
            errorMsg.append(e.getMessage()).append("\n");
            return errorMsg.toString();
        }

    }

    @Resource
    DataSource oracleDataSource;

    @Resource
    DataSource mysqlDataSource;

    /**
     * 测试数据库连接是否成功, 可以第一时间查看日志
     */
    public final void testMysql() {
        try (Connection mysqlConnection = mysqlDataSource.getConnection()) {
            log.info(mysqlConnection.getClass().toString());
            log.info("mysql 数据库连接成功");
        } catch (SQLException e) {
            log.error("mysql 数据库连接失败");
            log.error("mysql 数据库连接失败 cause = " + e.getCause());
        }
    }

    /**
     * 测试数据库连接是否成功, 可以第一时间查看日志
     */
    public final void testOracle() {
        try (Connection oracleConnection = oracleDataSource.getConnection()) {
            log.info(oracleConnection.getClass().toString());
            log.info("oracle 数据库连接成功");
        } catch (SQLException e) {
            log.error("oracle 数据库连接失败");
            log.error("oracle 数据库连接失败 cause  " + e.getCause());
        }
    }
}
