package com.ssm.dao;

import com.ssm.pojo.userInfo;

import java.util.List;

/**
 * @AUTHER XXY
 * @DATE 2023/5/6
 **/
public interface userInfoDao {
    // insert
    public void insertOneOfUserInfo(String name, String pwd);

    public List<userInfo> selectDetails();

    public List<userInfo> selectDetailsBySonQuery();

    public List<userInfo> selectByPool(String pool);
}
