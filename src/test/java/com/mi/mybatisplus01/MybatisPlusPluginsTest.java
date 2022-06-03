package com.mi.mybatisplus01;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mi.mybatisplus01.mapper.ProductMapper;
import com.mi.mybatisplus01.mapper.UserMapper;
import com.mi.mybatisplus01.pojo.Product;
import com.mi.mybatisplus01.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Classname: MybatisPlusPluginsTest
 * Date: 2022/6/3 15:28
 * Author: Mi
 * Description:
 */

@SpringBootTest
public class MybatisPlusPluginsTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ProductMapper productMapper;
    /**
     * 测试分页插件
     */
    @Test
    public void test01(){

        Page<User> page = new Page<>(2,5);
        Page<User> page1 = userMapper.selectPage(page, null);
        System.out.println(page1);
    }

    /**
     * 测试乐观锁插件
     */
    @Test
    public void test02(){
        Product productLi = productMapper.selectById(1);
        Product productWang = productMapper.selectById(1);

        productLi.setPrice(150);
        productMapper.updateById(productLi);

        productWang.setPrice(70);
        productMapper.updateById(productWang);

        Product product = productMapper.selectById(1);
        System.out.println(product);
    }

}
