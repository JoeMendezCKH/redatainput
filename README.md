# data-input 优化思路

## 1. 该版本环境搭建
1. 搭建环境基本与上一版本相同, 但是使用mybatis generate 逆向工程生成实体类与mapper
2. 取消 web , 使用 test 模块对实现对方法的测试
3. 启动方式不变, 依然是实现 CommandLineRunner 调用定时任务启动导入过程

## 2. 上个版本的 bug 收集

### 1. 统计出的问题

1. 错误1: `java.sql.SQLRecoverableException: IO Error: Got minus one from a read call`    

      ```text
      [Druid-ConnectionPool-Create-1264396116] ERROR c.alibaba.druid.pool.DruidDataSource - create connection SQLException, url: jdbc:oracle:thin:@b2l4416006.wicp.vip:48902:orcl, errorCode 17002, state 08006
        java.sql.SQLRecoverableException: IO Error: Got minus one from a read call
        Caused by: oracle.net.ns.NetException: Got minus one from a read call
      ```
   
   - 解决方法:  
     [修改Oracle配置](https://blog.csdn.net/mfanoffice2012/article/details/78475535)  
     [修改连接池配置](https://www.cnblogs.com/softidea/p/4004076.html), 修改空闲连接判断的相关配置, 空闲一定时间后要进行验证  

2. 错误2: `Error querying database`  

      ```text
        ### Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 120000, active 0, maxActive 20, creating 1
        ### The error may exist in cn/cps/dataInput/mapper/oracle/OracleMapper.java (best guess)
        ### The error may involve cn.cps.dataInput.mapper.oracle.OracleMapper.getCountClinicMaster
        ### The error occurred while executing a query
        ### Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.alibaba.druid.pool.GetConnectionTimeoutException: wait millis 120000, active 0, maxActive 20, creating 1
      ```

3. 错误3: `java.sql.SQLRecoverableException: IO Error: Socket read timed out`

      ```text
      [Druid-ConnectionPool-Create-1264396116] ERROR c.alibaba.druid.pool.DruidDataSource - create connection SQLException, url: jdbc:oracle:thin:@b2l4416006.wicp.vip:48902:orcl, errorCode 17002, state 08006
      java.sql.SQLRecoverableException: IO Error: Socket read timed out
        Caused by: oracle.net.ns.NetException: Socket read timed out
      ```
   
   - [jdbc driver版本](http://blog.itpub.net/29863023/viewspace-2700771/)

4. 错误4: `java.sql.SQLRecoverableException: IO Error: The Network Adapter could not establish the connection`

      ```text
      [Druid-ConnectionPool-Create-1264396116] ERROR c.alibaba.druid.pool.DruidDataSource - create connection SQLException, url: jdbc:oracle:thin:@b2l4416006.wicp.vip:48902:orcl, errorCode 17002, state 08006
      java.sql.SQLRecoverableException: IO Error: The Network Adapter could not establish the connection
        Caused by: oracle.net.ns.NetException: The Network Adapter could not establish the connection
        Caused by: java.net.ConnectException: Connection refused (Connection refused)
      ```
    - [服务器 ip 错误](https://www.cnblogs.com/fx-blog/p/7325299.html) 

- 基本上一直都报错误3, 每半个小时夹一条错误1, 每天偶尔会有错误4
- 目前看来都是 oracle 数据库的锅, 淦,sb (10-05)

- 错误2 涉及的表
    - PatMasterIndex
    - ClinicMaster
    - DiagnosisDict
    - StaffDict
    - ClinicItemDict
    - DrugDict
    - DrugPriceList
    - ExamItemDict
    - VLabItemDict
    - DeptDict

### 2. 耗时分析

- 根据日志记录的结果, 共有31天的结果
- 28天中的结果为 78020 ms左右, 误差不超过10ms, 1分半
- 从第29天到31天, 分别为 1768558ms; 1687151ms; 1710926ms; 28分钟左右

### 3. 优化的点

- 使用 Stream 流进行合理的优化, 提高运行效率
- 使用设计模式进行重构, 让代码好看一点

## TO DO LIST

- [x] Mysql 数据库的驱动版本  
- [x] Mysql 数据库连接配置与验证  
- [ ] Oracle 数据库的驱动版本  
- [ ] Oracle 数据库连接配置与验证  
- [ ] 定时任务的取消与关闭  
