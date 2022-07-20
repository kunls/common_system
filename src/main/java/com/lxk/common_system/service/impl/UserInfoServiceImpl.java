package com.lxk.common_system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxk.common_system.entity.UserInfo;
import com.lxk.common_system.mapper.UserInfoMapper;
import com.lxk.common_system.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
}
