package com.ssm.dao;

import com.ssm.pojo.userPool;

/**
 * @AUTHER XXY
 * @DATE 2023/5/11
 **/
public interface userPoolDao {
    public userPool queryPoolsByName(String name);
}
