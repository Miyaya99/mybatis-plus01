package com.mi.mybatisplus01;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.mi.mybatisplus01.mapper.UserMapper;
import com.mi.mybatisplus01.pojo.User;
import com.mi.mybatisplus01.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.*;

/**
 * Classname: MybatisPlusTest
 * Date: 2022/6/3 0:15
 * Author: Mi
 * Description:
 */
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    /**
     * 测试BaseMapper
     */
    @Test
    public void test01(){

        // 查询列表
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        // 插入 自带返回ID
//        User user = new User("liuxiaoya",17,"liuxiaoya@Mi.com");
//        int insert = userMapper.insert(user);
//        System.out.println(user);
//        System.out.println(insert);
        // 测试删除
//        userMapper.deleteById(2L);

//        Map<String,Object> map = new HashMap<>();
//        map.put("age",24);
//        userMapper.deleteByMap(map);

//        List<Long> longs = Arrays.asList(3L, 4L);
//        userMapper.deleteBatchIds(longs);

//        // 测试update
//        User user = new User(2L,"MiZhonghao",22,"Miyaya@qq.com");
//        userMapper.updateById(user);

        // 测试select
        // 测试自定义
//        Map<String, Object> map = userMapper.selectToMap(2L);
//        System.out.println(map);
    }

    /**
     * 测试IService
     */
    @Test
    public void Test02(){
        // 查询数量
        long count = userService.count();
        System.out.println(count);

        // 批量插入
//        List<User> userList = new ArrayList<>();
//        for(int i = 0;i < 10;++i){
//            User user = new User(null,"Miyaya"+i,19+i,"Miyaya"+i+"@Mi.cn");
//            userList.add(user);
//        }
//        boolean saveBatch = userService.saveBatch(userList);
//        System.out.println(saveBatch);
//        for (User user : userList) {
//            System.out.println(user);
//        }
    }

    /**
     * 测试wrapper
     */
    @Test
    public void test03(){
        // 条件查询组装
//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//        userQueryWrapper.eq("age",17).like("user_name","liu").isNotNull("email");
//        List<User> userList = userMapper.selectList(userQueryWrapper);
//        for (User user : userList) {
//            System.out.println(user);
//        }

        //条件排序组装
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderByAsc("age").orderByDesc("user_name");
//        List<User> userList = userMapper.selectList(queryWrapper);
//        for (User user : userList) {
//            System.out.println(user);
//        }


        //条件删除
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.isNull("email");
//        int delete = userMapper.delete(queryWrapper);
//        System.out.println(delete);
//        userMapper.deleteById(1L);

        //条件修改
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.likeRight("user_name", "liu").lt("age", 19);
//        User user = new User();
//        user.setEmail("Mylover@Mi.cn");
//        userMapper.update(user,queryWrapper);

        // 条件优先级
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("email", "Mylover")
//                .and(userQueryWrapper -> userQueryWrapper.gt("age", 100).or().isNull("user_name"));
//        User user = new User();
//        user.setUserName("刘懒懒");
//        userMapper.update(user, queryWrapper);

        // 组装查询字段
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select("user_name","email").lt("age",19);
//        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
//        maps.forEach(System.out::println);

        // 组装子查询
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.inSql("uid","select uid from t_user where uid <= 100");
//        List<User> userList = userMapper.selectList(queryWrapper);
//        userList.forEach(System.out::println);

        // 使用updateWrapper
//        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
//        userMapper.update(null,updateWrapper);

        //使用Condition解决sql组装
//        String userName = "";
//        Integer ageEnd = 20;
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like(!StringUtils.isBlank(userName),"user_name",userName)
//                .lt(ageEnd != null,"age",ageEnd);
//        List<User> userList = userMapper.selectList(queryWrapper);
//        userList.forEach(System.out::println);

        //LambdaQueryWrapper
        String userName = "Mi";
        Integer ageEnd = 20;
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(userName),User::getUserName,userName)
                .lt(ageEnd != null,User::getAge,ageEnd);
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);


    }

}






















