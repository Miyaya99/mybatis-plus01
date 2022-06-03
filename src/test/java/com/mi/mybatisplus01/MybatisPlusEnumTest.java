package com.mi.mybatisplus01;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mi.mybatisplus01.enums.SexEnum;
import com.mi.mybatisplus01.mapper.UserMapper;
import com.mi.mybatisplus01.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Classname: MybatisPlusEnumTest
 * Date: 2022/6/3 16:49
 * Author: Mi
 * Description:
 */
@SpringBootTest
public class MybatisPlusEnumTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test01(){
        User user = new User(null, "testEnum2", 17, "testEnum@Plus.cn", SexEnum.FEMALE, null);
        userMapper.insert(user);
        User user1 = userMapper.selectById(user.getUid());
        System.out.println(user1);

//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("user_name","testEnum");
//        List<User> userList = userMapper.selectList(queryWrapper);
//        userList.forEach(System.out::println);
//        List<User> userList = userMapper.selectList(null);
//        System.out.println(userList);
    }
}
