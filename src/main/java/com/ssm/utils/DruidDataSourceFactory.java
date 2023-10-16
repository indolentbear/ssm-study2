package com.ssm.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

import javax.sql.DataSource;

/**
 * @AUTHER XXY
 * @DATE 2023/10/12
 **/
public class DruidDataSourceFactory extends PooledDataSourceFactory {

    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }
}
