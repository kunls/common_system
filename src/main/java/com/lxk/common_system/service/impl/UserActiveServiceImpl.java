package com.lxk.common_system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxk.common_system.entity.UserActive;
import com.lxk.common_system.mapper.UserActiveMapper;
import com.lxk.common_system.service.UserActiveService;
import org.springframework.stereotype.Service;

@Service
public class UserActiveServiceImpl extends ServiceImpl<UserActiveMapper, UserActive> implements UserActiveService {
}
