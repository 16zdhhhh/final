package com.zd.util;




import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MybatisUtils {
    public static SqlSession getSqlSession(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            System.out.println("mybatis-config文件加载失败");
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

    public static String encrypt(String clearType){
        byte[] bytes = clearType.getBytes(StandardCharsets.UTF_8);

        MessageDigest md5= null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md5.update(bytes);


        String encode = Base64.getEncoder().encodeToString(md5.digest());

        return encode;
        }


}

