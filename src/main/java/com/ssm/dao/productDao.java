package com.ssm.dao;

import com.ssm.pojo.product;

import java.util.HashMap;
import java.util.List;

/**
 * @AUTHER XXY
 * @DATE 2023/5/18
 **/
public interface productDao {
    //    动态sql
    public List<product> selectByCondition(HashMap<String, Object> params);
    public List<product> selectByWhereCondition(HashMap<String, Object> params);
    // foreach
    public List<product> selectByCity(List<String> cities);
    // 模糊查询
    public List<product> selectByNick(String keyword);
}
