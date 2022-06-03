package com.mi.mybatisplus01.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classname: sss
 * Date: 2022/6/3 16:06
 * Author: Mi
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;


}

