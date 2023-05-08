package com.ssm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @AUTHER XXY
 * @DATE 2023/5/6
 **/
public class mybatisUtil {
    private static SqlSessionFactory factory;
    private static final ThreadLocal<SqlSession> session = new ThreadLocal<SqlSession>();

    static{
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession getSession(boolean isAutoCommit) {
        SqlSession ret = session.get();
        if(ret==null){
            ret = factory.openSession(isAutoCommit);
            session.set(ret);
        }
        return ret;
    }

    public static SqlSession getSession() {
        return getSession(false);
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static <T extends Object>T getMapper(Class<T> c){
        SqlSession ss = getSession();
        return ss.getMapper(c);
    }

    public static void finish() {
        session.get().commit();
        session.remove();
    }

    public static void rollBack() {
        session.get().rollback();
        session.remove();
    }
}
