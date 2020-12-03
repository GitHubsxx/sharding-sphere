package com.sxx.shardingsphere.controller;
import com.sxx.shardingsphere.entity.User;
import com.sxx.shardingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author sxx
 * @date 2020-12-03
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }
    @GetMapping("/insert")
    public Boolean insert(User user) {
        return userService.save(user);
    }
}
