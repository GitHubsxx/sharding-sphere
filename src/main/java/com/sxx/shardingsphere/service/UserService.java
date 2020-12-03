package com.sxx.shardingsphere.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxx.shardingsphere.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    /**
     * 保存用户信息
     * @param entity
     * @return
     */
   @Override
    boolean save(User entity);
    /**
     * 查询全部用户信息
     * @return
    */
    List<User> getUserList();

}
