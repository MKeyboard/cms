package com.cmschina.product.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@Component
public class DynamicDataSourceConfig {	
 
	
    @Bean
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstMasterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource secondSlaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

	
    @Bean
    @Primary
    public com.cmschina.product.datasource.DynamicDataSource dataSource(DataSource firstMasterDataSource, DataSource secondSlaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(com.cmschina.product.datasource.DataSourceNames.FIRST, firstMasterDataSource);
        targetDataSources.put(com.cmschina.product.datasource.DataSourceNames.SECOND, secondSlaveDataSource);
        return new com.cmschina.product.datasource.DynamicDataSource(firstMasterDataSource, targetDataSources);
    }

}