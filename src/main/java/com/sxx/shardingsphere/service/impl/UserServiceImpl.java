package com.sxx.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.shardingsphere.dao.UserDao;
import com.sxx.shardingsphere.entity.User;
import com.sxx.shardingsphere.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }
}
