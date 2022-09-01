package com.zd.service.Impl;


import com.zd.dao.userMapper.UserMapper;
import com.zd.pojo.User;
import com.zd.service.UserService;
import com.zd.util.MybatisUtils;

import org.apache.ibatis.session.SqlSession;


public class UserServiceImpl implements UserService {

    @Override
    public boolean insertUser(User user) {
        //1先加密
        user.setPassword(MybatisUtils.encrypt(user.getPassword()));
        //2在获取连接执行sql
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();

        return true;
    }

    @Override
    public User getUser(String phone) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByPhone(phone);
        return user;
    }

    @Override
    public String getPasswordByUsername(String username) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String password = mapper.getPassword(username);
        return password;
    }

    @Override
    public boolean loginByUsernamePassword(String username,String password) {
        String passwordByUsername = getPasswordByUsername(username);
        String encrypt = MybatisUtils.encrypt(password);
        return encrypt.equals(passwordByUsername);


    }


}
