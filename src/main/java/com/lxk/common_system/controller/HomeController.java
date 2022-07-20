package com.lxk.common_system.controller;

import com.lxk.common_system.common.R;
import com.lxk.common_system.entity.PhoneSale;
import com.lxk.common_system.entity.UserActive;
import com.lxk.common_system.entity.Video;
import com.lxk.common_system.service.PhoneSaleService;
import com.lxk.common_system.service.UserActiveService;
import com.lxk.common_system.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    PhoneSaleService phoneSaleService;
    @Autowired
    UserActiveService userActiveService;
    @Autowired
    VideoService videoService;

    @GetMapping("/getPhoneData")
    public R<List<PhoneSale>> getPhoneData() {
        List<PhoneSale> phoneList = phoneSaleService.list();
        return R.success(phoneList);
    }

    @GetMapping("/getUserData")
    public R<List<UserActive>> getUserData() {
        List<UserActive> userList = userActiveService.list();

        return R.success(userList);
    }

    @GetMapping("/getVideoData")
    public R<List<Video>> getVideoData(){
        List<Video> videoList = videoService.list();
        return R.success(videoList);
    }
}
