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

    public String getPassword(@Param("username") String username);
}
