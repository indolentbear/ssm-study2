package com.ssm.pojo;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @AUTHER XXY
 * @DATE 2023/5/11
 **/
public class userPool {
    private int id;
    private String name;
    private String city;

    List<userInfo> users;

    @Override
    public String toString() {
        JSONObject info = new JSONObject();
        info.put("id", id);
        info.put("name",name);
        info.put("city",city);
//        AtomicInteger i = new AtomicInteger(1);
//        users.forEach(item->{
//            info.put(Integer.toString(i.getAndIncrement()),item);
//        });
        info.put("users", users);
        return JSON.toJSONString(info);
    }
}
