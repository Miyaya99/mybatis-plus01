package com.mi.mybatisplus01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mi.mybatisplus01.pojo.Product;
import com.mi.mybatisplus01.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Classname: ProductMapper
 * Date: 2022/6/3 16:08
 * Author: Mi
 * Description:
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
