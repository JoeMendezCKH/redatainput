package com.joe.input.service;

import com.joe.input.mapper.mysql.MysqlDao;
import com.joe.input.mapper.oracle.OracleDao;
import com.joe.input.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ckh
 * @since 2021/1/19
 */
@Service
public class DataInputJobsService {
    private static final Logger log = LoggerFactory.getLogger(DataInputJobsService.class);
    private static final int PAGESHOW = 1000;
    private static final int SIZE = Integer.MAX_VALUE;

    @Resource
    OracleDao oracleDao;

    @Resource
    MysqlDao mysqlDao;


    /**
     * 字典表，删除了重新导入, 从第一页开始
     */

    public void vLabItemDict() {
        StringBuilder message = new StringBuilder();
        try {
            //删除 mysql 原有数据
            mysqlDao.deleteVLabItemDict();
            log.info("===> VLabItemDict old data delete success");
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItVLabItemDict> oracleList = oracleDao.getAllVLabItemDict(begin, PAGESHOW);
                if (oracleList.size() == 0) break;

                // 当前页插入 mysql
                oracleList
                        .forEach(vLabItemDict -> {
                            try {
                                mysqlDao.insertVLabItemDict(vLabItemDict);
                            } catch (Exception e) {
                                message.append(e.getMessage()).append("\n");
                            }
                        });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> VLabItemDict end && with error message:  " + message);
        }
    }


    public void clinicMaster() {
        //记录异常
        StringBuilder message = new StringBuilder();
        try {
            //记录mysql数据库的记录数量
            int index = mysqlDao.getNumRecordItClinicMaster();
            String maxDate;
            if (index != 0) {
                maxDate = mysqlDao.getMaxDateItClinicMaster();
            } else {
                maxDate = "1972-10-10 10:10:10";
            }
            log.info("ClinicMaster mysql 中最大时间为：" + maxDate);
            int size = (oracleDao.getCountClinicMaster() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                // 获取指定范围内 大于 datetime 的数据
                List<ItClinicMaster> oracleList = oracleDao.getAllClinicMaster(begin, PAGESHOW, maxDate);
                if (oracleList.size() == 0) continue;

                // 884312 条数据
                // 数据量过大,采用估算, 18min导入了12929 条, 估计需要1224min 也就是20h
                // 换为并行流后, 约 3min导入10694,  估计需要 246 min 也就是 4h
                oracleList.parallelStream().forEach(clinicMaster -> {
                    try {
                        mysqlDao.insertItClinicMaster(clinicMaster);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> ClinicMaster end && with error message: " + message);
        }

    }

    public void clinicItemDict() {
        StringBuilder message = new StringBuilder();
        try {
            //删除mysql中已有数据
            mysqlDao.deleteClinicItemDict();
            log.info("ClinicItemDict 删除完成");
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItClinicItemDict> oracleList = oracleDao.getAllClinicItemDict(begin, PAGESHOW);
                //当前页为空跳出循环
                if (oracleList.size() == 0) break;

                // 9240 条数据
                // 12.08min
//                oracleList.forEach(clinicItemDict -> {
//                    try {
//                        mysqlDao.insertClinicItemDict(clinicItemDict);
//                    } catch (Exception e) {
//                        message.append(e.getMessage()).append("\n");
//                    }
//                });
                // 3.27 min
                oracleList.parallelStream().forEach(
                        clinicItemDict -> {
                            try {
                                mysqlDao.insertClinicItemDict(clinicItemDict);
                            } catch (Exception e) {
                                message.append(e.getMessage()).append("\n");
                            }
                        }
                );
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> ClinicItemDict end && with error message: " + message + "\n");
        }
    }

    public void deptDict() {
        StringBuilder message = new StringBuilder();
        try {
            //删除mysql中数据
            mysqlDao.deleteDeptDict();
            log.info("DeptDict 删除完成");
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                //分页取出oracle中数据
                List<ItDeptDict> oracleList = oracleDao.getAllDeptDict(begin, PAGESHOW);
                if (oracleList.size() == 0) break;


                oracleList.parallelStream()
                        .forEach(deptDict -> {
                            try {
                                mysqlDao.insertDeptDict(deptDict);
                            } catch (Exception e) {
                                message.append(e.getMessage()).append("\n");
                            }
                        });

            }

        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> DeptDict end && with error message:  " + message);
        }

    }

    public void diagnosisDict() {
        //记录异常
        StringBuilder message = new StringBuilder();
        try {
            //记录MYSQL数据库的记录数量
            int index = mysqlDao.getNumRecordDiagnosisDict();
            //记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlDao.getMaxDateDiagnosisDict();
            } else {
                maxTime = "1972-10-10 10:10:10";
            }
            log.info("DiagnosisDict mysql当前最大时间：" + maxTime);
            int size = (oracleDao.getCountDiagnosisDict() / PAGESHOW) + 1;
            System.out.println("size = " + size);
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                List<ItDiagnosisDict> oracleList = oracleDao.getAllDiagnosisDict(begin, PAGESHOW, maxTime);

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
//                    message.append(e.getMessage()).append("\n");
//                }
                // 12.15 min  优化 69% 且有异常处理
                oracleList.parallelStream().forEach(diagnosisDict -> {
                    try {
                        mysqlDao.insertDiagnosisDict(diagnosisDict);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> DiagnosisDict end && with error message:  " + message);
        }
    }

    public void staffDict() {
        StringBuilder message = new StringBuilder();
        try {
            // 删除 mysql中原有数据
            // mysqlMapper.truncateStaffDict();
            // log.info("StaffDict delete success");

            int index = mysqlDao.getNumStaffDict();
            //记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlDao.getMaxDateStaffDict();
            } else {
                maxTime = "1950-10-10 10:10:10";
            }
            log.info("StaffDict mysql当前最大时间：" + maxTime);

            int size = (oracleDao.getCountStaffDict(maxTime) / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                //获取当前页数据
                List<ItStaffDict> oracleList = oracleDao.getAllStaffDict(begin, PAGESHOW, maxTime);
                if (oracleList.size() == 0) continue;

                /* 判断 mysql 中是否存在这些 数据, 如果存在则删除 */
                List<String> idList = oracleList.stream().map(ItStaffDict::getId).collect(Collectors.toList());
                idList.parallelStream().forEach(staffId -> {
                    try {
                        int count = mysqlDao.isExistedStaff(staffId);
                        if (count != 0) {
                            mysqlDao.delStaffById(staffId);
                        }
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });

                // 当前页导入mysql
                oracleList.parallelStream().forEach(staffDict -> {
                    try {
                        mysqlDao.insetStaffDict(staffDict);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> StaffDict end && with error message:  " + message);
        }
    }

    public void drugDict() {
        StringBuilder message = new StringBuilder();
        try {
            // 删除mysql已有数据
            // mysqlMapper.truncateDrugDict();
            // log.info("DrugDict delete success ");
            int index = mysqlDao.getNumDrugDict();
            // 记录最大时间
            String maxTime;
            if (index != 0) {
                maxTime = mysqlDao.getMaxTimeDrugDict();
            } else {
                maxTime = "1950-10-10 10:10:10";
            }
            log.info("drugDict mysql当前最大时间：" + maxTime);

            int size = (oracleDao.getCountDrugDict() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                int end = (i + 1) * PAGESHOW;
                //获取当前页数据
                List<ItDrugDict> oracleList = oracleDao.getAllDrugDict(begin, PAGESHOW, maxTime);
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
                        int count = mysqlDao.isExistedDict(split[0], split[1]);
                        if (count != 0) {
                            mysqlDao.delDrugByCodeAndSpec(split[0], split[1]);
                        }
                    } catch (Exception e) {
//                                message.append(e.getMessage()).append("\n");
                        log.error("split[]-> {}; split[0]-> {}, split[1]-> {}", split, split[0], split[1]);
                        log.error("drugDictList.parallelStream().forEach, {}", e.getMessage());
                    }
                });


                //当前页导入mysql
                oracleList.parallelStream().forEach(drugDict -> {
                    try {
                        mysqlDao.insertDrugDict(drugDict);
                    } catch (Exception e) {
//                                message.append(e.getMessage()).append("\n");
                        log.error("oracleList.stream().parallel" + e.getMessage());
                    }
                });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> DrugDict end && with error message:  " + message);
        }
        log.info("===> DrugDict end ===========");
    }


    public void drugPriceList() {
        //声明记录异常信息的变量
        StringBuilder message = new StringBuilder();
        //删除mysql中原有数据
        mysqlDao.truncateDrugPriceList();
        log.info("DrugPriceList 删除完成");
        try {
            //分页导入导出
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                //获取当前页数据
                List<ItDrugPriceList> oracleList = oracleDao.getAllDrugPriceList(begin, PAGESHOW);
                //当前页为空时，跳出循环
                if (oracleList.size() == 0) break;

                //当前页导入mysql
                oracleList.parallelStream().forEach(drugPriceList -> {
                    try {
                        mysqlDao.insertDrugPriceList(drugPriceList);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }
        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> DrugPriceList end && with error message: " + message);
        }
    }

    public void patMasterIndex() {
        //记录异常
        StringBuilder message = new StringBuilder();
        try {
            //记录数据库记录的数量
            int index = mysqlDao.getNumRecordPatMasterIndex();
            //记录mysql中最大时间
            String matTime;
            if (index != 0) {
                matTime = mysqlDao.getMaxDatePatMasterIndex();
            } else {
                matTime = "1972-10-10 10:10:10";
            }
            log.info("PatMasterIndex mysql中最大时间为：" + matTime);

            int size = (oracleDao.getCountPatMasterIndex() / PAGESHOW) + 1;
            //分页导入导出
            for (int i = 0; i < size; i++) {
                int begin = i * PAGESHOW;
                int end = (i + 1) * PAGESHOW;
                //获取当前页数据
                List<ItPatMasterIndex> oracleList = oracleDao.getAllPatMasterIndex(begin, PAGESHOW, matTime);
                //当前页为空时，跳出循环
                if (oracleList.size() == 0) continue;


                /* 判断是否存在 */
                List<String> patientIds = oracleList.parallelStream().map(ItPatMasterIndex::getPatientId).collect(Collectors.toList());
                patientIds.parallelStream().forEach(patientId -> {
                    try {
                        int count = mysqlDao.patMasterIndexIsExisted(patientId);
                        if (count != 0) {
                            mysqlDao.delPatMasterIndex(patientId);
                        }
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });

                //当前页导入mysql
                oracleList.parallelStream().forEach(patMasterIndex -> {
                    try {
                        mysqlDao.insertPatMasterIndex(patMasterIndex);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }

        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> PatMasterIndex end && with error message: " + message);
        }
    }


    public void examItemDict() {
        StringBuilder message = new StringBuilder();
        try {
            //删除mysql已有数据
            mysqlDao.deleteExamItemDict();
            log.info("ExamItemDict 删除完毕");
            //分页导出导入
            for (int i = 0; i < SIZE; i++) {
                int begin = i * PAGESHOW;
                List<ItExamItemDict> oracleList = oracleDao.getAllExamItemDict(begin, PAGESHOW);

                if (oracleList.size() == 0) break;

                oracleList.parallelStream().forEach(examItemDict -> {
                    try {
                        mysqlDao.insertExamItemDict(examItemDict);
                    } catch (Exception e) {
                        message.append(e.getMessage()).append("\n");
                    }
                });
            }

        } catch (Exception e) {
            message.append(e.getMessage()).append("\n");
        } finally {
            log.error("===> ExamItemDict end && with error message: " + message);
        }

    }

    /**
     * 单纯测试切面表达式和日志输出效果
     */

    public void test() {
        try {
            System.out.println("this is a test method");
            // int x = 10 / 0;
            log.info("this is a test");
        } catch (Exception e) {
            log.error("test error:" + e.getMessage());
        } finally {
            log.info(" test end");
        }
    }
}
