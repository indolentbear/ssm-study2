package com.ssm.dao;

import com.ssm.pojo.userDetails;

import java.util.List;

/**
 * @AUTHER XXY
 * @DATE 2023/5/8
 **/
public interface userDetailsDao {
    // select
    public List<userDetails> findAllOfUserDetails();
    public userDetails queryByUuid(int uuid);
}
