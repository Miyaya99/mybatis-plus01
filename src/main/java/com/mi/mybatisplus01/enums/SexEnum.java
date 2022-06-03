package com.mi.mybatisplus01.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Classname: SexEnum
 * Date: 2022/6/3 16:40
 * Author: Mi
 * Description:
 */
@Data
public enum SexEnum {
    MALE(1,"male"),
    FEMALE(2,"female");

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }

    @EnumValue
    private Integer sex;

    private String sexName;

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }
}
