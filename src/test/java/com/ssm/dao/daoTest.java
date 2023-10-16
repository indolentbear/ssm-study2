package com.ssm.dao;

import com.ssm.pojo.product;
import com.ssm.pojo.userDetails;
import com.ssm.pojo.userInfo;
import com.ssm.pojo.userPool;
import com.ssm.utils.mybatisUtil;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class daoTest {
    @Test
    public void selectUserDetails2Info(){
        userDetailsDao detailsDao = mybatisUtil.getMapper(userDetailsDao.class);
        List<userDetails> udList = detailsDao.findAllOfUserDetails();
        try{
            userInfoDao infoDao = mybatisUtil.getMapper(userInfoDao.class);

            udList.forEach(item->{
                infoDao.insertOneOfUserInfo(item.getName(), UUID.randomUUID().toString().substring(0,10));
                System.out.println(item);
            });

            mybatisUtil.finish();
        }catch(Exception e){
            System.out.printf(e.toString());
            mybatisUtil.rollBack();
        }
    }

    @Test
    public void selectDetailsTest(){
        userInfoDao infoDao = mybatisUtil.getMapper(userInfoDao.class);
        List<userInfo> uiList = infoDao.selectDetails();
        uiList.forEach(item->{
            System.out.println(item);
        });
    }

    @Test
    public void selectInfoBySonQueryTest(){
        userInfoDao infoDao = mybatisUtil.getMapper(userInfoDao.class);
        List<userInfo> uiList = infoDao.selectDetailsBySonQuery();
        uiList.forEach(item->{
            System.out.println(item);
        });
    }

    @Test
    public void selectPoolByNameTest(){
        userPoolDao upDao = mybatisUtil.getMapper(userPoolDao.class);
        userPool up = upDao.queryPoolsByName("taobao");
        System.out.println(up);
    }

    @Test
    public void selectProduct(){
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("price", 500);
//        params.put("madeAddress", "上海市");

        productDao mapper = mybatisUtil.getMapper(productDao.class);
        List<product> products = mapper.selectByCondition(params);
        products.forEach(item->{
            System.out.println(item);
        });
    }

    @Test
    public void selectProduct2(){
        HashMap<String, Object> params = new HashMap<String, Object>();
//        params.put("price", 500);
        params.put("madeAddress", "上海市");

        productDao mapper = mybatisUtil.getMapper(productDao.class);
        List<product> products = mapper.selectByWhereCondition(params);
        products.forEach(item->{
            System.out.println(item);
        });
    }
    @Test
    public void testSelectByCity() {
        List<String> param = new ArrayList<>();
        param.add("上海市");
        param.add("广州市");

        productDao mapper = mybatisUtil.getMapper(productDao.class);
        List<product> products = mapper.selectByCity(param);
        products.forEach(item->{
            System.out.println(item);
        });
    }


    @Test
    public void testSelectByNick() {
        String str = "berry";

        productDao mapper = mybatisUtil.getMapper(productDao.class);
        List<product> products = mapper.selectByNick(str);
        products.forEach(item->{
            System.out.println(item);
        });
    }
}