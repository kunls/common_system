package com.lxk.common_system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxk.common_system.entity.Video;
import com.lxk.common_system.mapper.VideoMapper;
import com.lxk.common_system.service.VideoService;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {
}
