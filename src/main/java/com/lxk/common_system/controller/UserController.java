package com.lxk.common_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxk.common_system.common.R;
import com.lxk.common_system.entity.UserInfo;
import com.lxk.common_system.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/getUsers")
    public R<Page<UserInfo>> getUsers(Integer page,Integer pageSize,String keyword) {
        Page<UserInfo> userPage = new Page<>(page, pageSize);
        LambdaQueryWrapper<UserInfo> wrapper = new LambdaQueryWrapper<>();
        if (keyword != null) {
            wrapper.like(UserInfo::getName,keyword);
        }
        userInfoService.page(userPage,wrapper);
        return R.success(userPage);
    }

    @PostMapping("/addUser")
    public R<String> addUser(@RequestBody UserInfo userInfo) {
        boolean save = userInfoService.saveOrUpdate(userInfo);
        System.out.println(userInfo);
        if (userInfo == null || !save) {
            return R.error("添加用户失败");
        }
        return R.success("添加用户成功");
    }
}
