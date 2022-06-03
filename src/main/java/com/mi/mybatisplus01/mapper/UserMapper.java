package com.mi.mybatisplus01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mi.mybatisplus01.pojo.Product;
import com.mi.mybatisplus01.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Classname: UserMapper
 * Date: 2022/6/3 0:06
 * Author: Mi
 * Description:
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

    Map<String,Object> selectToMap(Long id);
}
