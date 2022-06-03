package com.mi.mybatisplus01.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.mi.mybatisplus01.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Classname: User
 * Date: 2022/6/3 0:01
 * Author: Mi
 * Description:
 */

//@TableName("t_user")
@Data // 除了有参构造 其他都有 加入有参构造时候记得加无参数构造
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @TableId
    private Long uid;

    private String userName;

    private Integer age;

    private String email;

    @TableField("sex")
    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
