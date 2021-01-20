package com.joe.reinput.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author ckh
 * @since  2021/1/18 13:17
 */
@Configuration
@MapperScan(basePackages = "com.joe.reinput.mapper.oracle", sqlSessionTemplateRef = "oracleSqlSessionTemplate")
public class OracleDataSourceConfig {

    @Bean(name = "oracleSqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("oracleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    /**
     * 默认的传播行为是 nested 嵌入式:
     * 如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则执行 REQUIRED 类似的操作
     * required: 如果当前没有事务，就新建一个事务，如果已经存在一个事务中，加入到这个事务中.
     */
    @Bean(name = "oracleTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("oracleDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "oracleSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("oracleSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
