package com.example.system.controller;

import com.example.system.entity.dto.user.UserInputDTO;
import com.example.system.entity.dto.user.UserSelfAlertDTO;
import com.example.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author luckydddyf
 * @Date 2021-01-05 16:10
 */
@RestController
@RequestMapping("/api/self")
@Api(value = "/self",tags = {"个人信息管理"})
public class UserSelfController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    @ApiOperation("用户注册")
    public void addUsers(UserInputDTO inputDTO){
        userService.addUser(inputDTO);
    }

    @PostMapping("/alert")
    @ApiOperation("修改个人信息")
    public void alertUserSelf(UserSelfAlertDTO alertDTO){
        userService.alertUserSelf(alertDTO);
    }
}