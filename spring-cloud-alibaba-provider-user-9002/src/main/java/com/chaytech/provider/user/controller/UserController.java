package com.chaytech.provider.user.controller;

import com.chaytech.model.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.chaytech.provider.user.service.IUserService;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * User-controller
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:52
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user/createUser")
    public boolean createUser(@RequestBody  UserEntity user){
        return userService.createUser(user);
    }

    @GetMapping("/user/getUser/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/user/listUser")
    public List<UserEntity> listUser(){
        return userService.listUser();
    }

    @GetMapping("/feign/feignTimeout")
    public String feignTimeout()throws Exception{
        TimeUnit.SECONDS.sleep(5);
        return "openFeign timeout test";
    }
}
