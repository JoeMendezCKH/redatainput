package com.joe.input.schedule;


import com.joe.input.service.DataInputJobsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * TODO: 使用模板模式优化一下代码, 现在代码不好看
 *
 * @author Joe
 * @version 1.1
 * @since 2020/4/14 19:11
 */
@Component
public class ScheduleService {

    @Resource
    DataInputJobsService dataInputJobsService;

    @Resource
    StartTime startTime;

    @Resource
    DataSource oracleDataSource;

    @Resource
    DataSource mysqlDataSource;

    private static final Logger logger = LoggerFactory.getLogger(ScheduleService.class);
    /**
     * 总任务数 10
     */
    private static final int NUM_OF_TASK = 10;
    /**
     * 结束时间的long型数组, 因为结束时间不同, 所以最大的数即为最晚的时间
     */
    private final AtomicLongArray longArray = new AtomicLongArray(NUM_OF_TASK);
    private final ScheduledExecutorService executor =
            new ScheduledThreadPoolExecutor(NUM_OF_TASK,
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.DiscardPolicy());

    /**
     * 使用 CyclicBarrier 阻塞, 等待计算总时间
     */
    private final CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM_OF_TASK);

    /**
     * 一天的毫秒数
     */
    private final long oneDay = 24 * 60 * 60 * 1000;
    private long start;

    public final void startTask() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    /**
     * 测试数据库连接是否成功, 可以第一时间查看日志
     */
    public final void testMysql() {
        try (Connection mysqlConnection = mysqlDataSource.getConnection()) {
            logger.info(mysqlConnection.getClass().toString());
            logger.info("mysql 数据库连接成功");
        } catch (SQLException e) {
            logger.error("mysql 数据库连接失败");
            logger.error("mysql 数据库连接失败 cause = " + e.getCause());
        }
    }

    /**
     * 测试数据库连接是否成功, 可以第一时间查看日志
     */
    public final void testOracle() {
        try (Connection oracleConnection = oracleDataSource.getConnection()) {
            logger.info(oracleConnection.getClass().toString());
            logger.info("oracle 数据库连接成功");
        } catch (SQLException e) {
            logger.error("oracle 数据库连接失败");
            logger.error("oracle 数据库连接失败 cause  " + e.getCause());
        }
    }

    /**
     * 第一个启动的任务, 由它来调用最后的统计时间方法
     */
    private void task1() {
        long initDelay = getTimeMillis(startTime.startTimePatMasterIndex) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        logger.info("配置完成");
        executor.scheduleAtFixedRate(() -> {
            try {
                start = System.currentTimeMillis();
                testMysql();
                testOracle();
                logger.info("=============> start working <=============");
                dataInputJobsService.patMasterIndex();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    // 只有所有的任务都执行完了, 才会继续执行接下来的代码
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                longArray.set(0, System.currentTimeMillis());
                // 让其他线程设置结束时间
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    logger.error(e.getMessage());
                }
                endTime();
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    /**
     * 其他任务, 以后如果加任务, 复制该方法, 更改调用的 service方法 和 启动时间 以及 longArray的索引 即可
     */
    private void task2() {
        long initDelay = getTimeMillis(startTime.startTimeClinicMaster) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {

            dataInputJobsService.clinicMaster();

            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                logger.error(e.getMessage());
            }
            longArray.set(1, System.currentTimeMillis());

        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task3() {
        long initDelay = getTimeMillis(startTime.startTimeDeptDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.deptDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(2, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task4() {
        long initDelay = getTimeMillis(startTime.startTimeDiagnosisDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.diagnosisDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(3, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task5() {
        long initDelay = getTimeMillis(startTime.startTimeDrugDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.drugDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(4, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);

    }

    private void task6() {
        long initDelay = getTimeMillis(startTime.startTimeDrugPriceList) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.drugPriceList();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(5, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task7() {
        long initDelay = getTimeMillis(startTime.startTimeExamItemDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.examItemDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(6, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task8() {
        long initDelay = getTimeMillis(startTime.startTimeClinicItemDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.clinicItemDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(7, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task9() {
        long initDelay = getTimeMillis(startTime.startTimeStaffDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.staffDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    logger.error(e.getMessage());
                }
                longArray.set(8, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    private void task10() {
        long initDelay = getTimeMillis(startTime.startTimeVLabItemDict) - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        executor.scheduleAtFixedRate(() -> {
            try {
                dataInputJobsService.vLabItemDict();
            } catch (Exception e) {
                logger.error(e.getMessage());
            } finally {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                longArray.set(9, System.currentTimeMillis());
            }
        }, initDelay, oneDay, TimeUnit.MILLISECONDS);
    }

    /**
     * 结束今日任务后统计时间
     */
    private void endTime() {
        long max = longArray.get(0);
        for (int i = 0; i < NUM_OF_TASK; i++) {
            // 说明还有其他任务没执行
            if (longArray.get(i) == 0) {
                logger.error("有任务没有执行完就开始计算结束了, 任务id = {}", i);
                return;
            }
            if (longArray.get(i) > max) {
                max = longArray.get(i);
            }
        }
        if (max != 0) {
            logger.info("===> Total use time : " + (max - start) + " ms! =========");
            cyclicBarrier.reset();
            for (int i = 0; i < NUM_OF_TASK; i++) {
                longArray.set(i, 0);
            }
        }
    }

    /**
     * 获取指定时间对应的毫秒数
     *
     * @param time "HH:mm:ss"
     * @return 毫秒数
     */
    private static long getTimeMillis(String time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        } catch (ParseException e) {
            logger.error("getTimeMillis error: " + e.getMessage());
        }
        return 0;
    }

}

