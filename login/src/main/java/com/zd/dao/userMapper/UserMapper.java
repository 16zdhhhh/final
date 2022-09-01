package com.zd.dao.userMapper;

import com.zd.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer insertUser(@Param("user") User user);

    /**
     * 利用手机号查询用户信息
     * @param phone
     * @return
     */
    public User getUserByPhone(@Param("phone")String phone);

    /**
     * 根据用户名查询密码，用来验证用户登录
     * @param username
     * @return
     */
    public String getPassword(@Param("username") String username);
}
