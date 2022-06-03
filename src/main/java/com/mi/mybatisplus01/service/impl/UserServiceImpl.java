package com.mi.mybatisplus01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mi.mybatisplus01.mapper.UserMapper;
import com.mi.mybatisplus01.pojo.User;
import com.mi.mybatisplus01.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Classname: UserServiceImpl
 * Date: 2022/6/3 10:05
 * Author: Mi
 * Description:
 *          这样既能使用mybatisPlus提供的Service 还能自定义Service
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
