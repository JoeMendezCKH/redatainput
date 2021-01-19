package com.joe.input.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author ckh
 * @since  2021/1/18 13:17
 */
@Configuration
public class MultiDataSourceConfig {

    @Bean(name = "mysqlDataSource")
    @ConfigurationProperties("spring.datasource.druid.mmysql")
    public DataSource dataSourceOne() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setMinEvictableIdleTimeMillis(30000);
        dataSource.setMaxEvictableIdleTimeMillis(900000);
        return dataSource;
    }

    @Primary
    @Bean(name = "oracleDataSource")
    @ConfigurationProperties("spring.datasource.druid.moracle")
    public DataSource dataSourceTwo() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setMinEvictableIdleTimeMillis(30000);
        dataSource.setMaxEvictableIdleTimeMillis(900000);
        return dataSource;
    }
}
