/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: User
 * @Package com.atguigu.java
 * @author: apple
 * @date: 2019-07-20 11:19
 * @since JDK 1.8
 */
package com.atguigu.java.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @ClassName : User
 * @AUTHOR :  apple
 * @DATE :    2019-07-20 11:19
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {
    /**
     * 主键Id
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
}
