package com.ssm.dao;

import com.ssm.pojo.userDetails;
import com.ssm.pojo.userInfo;
import com.ssm.utils.mybatisUtil;
import junit.framework.TestCase;
import org.junit.Test;

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


}