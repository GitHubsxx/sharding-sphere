package com.sxx.shardingsphere.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxx.shardingsphere.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Userdao层
 * @author sxx
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
