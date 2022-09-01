package com.zd.service;

import com.zd.pojo.User;

public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean insertUser(User user);

    public User getUser(String phone);
}
