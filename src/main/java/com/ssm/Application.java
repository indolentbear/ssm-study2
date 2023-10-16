package com.ssm;

import com.ssm.dao.productDao;
import com.ssm.pojo.product;
import com.ssm.utils.mybatisUtil;

import java.util.List;

/**
 * @AUTHER XXY
 * @DATE 2023/10/12
 **/
public class Application {

    public static void main(String[] args) {


        String str = "berry";
        productDao mapper = mybatisUtil.getMapper(productDao.class);
        List<product> products = mapper.selectByNick(str);
        products.forEach(item->{
            System.out.println(item);
        });
    }
}
