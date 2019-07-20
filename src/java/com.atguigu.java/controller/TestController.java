/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: TestController
 * @Package com.atguigu.java.controller
 * @author: apple
 * @date: 2019-07-20 11:32
 * @since JDK 1.8
 */
package com.atguigu.java.controller;

import com.atguigu.java.entity.User;
import com.atguigu.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : TestController
 * @AUTHOR :  apple
 * @DATE :    2019-07-20 11:32
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }


    @GetMapping("/insert")
    public Boolean insert(User user) {
        for (int i = 10; i < 40; i++) {
            User user1 = new User();
            user1.setAge((int) (i + Math.random() * 10)).setName("name_" + i).setId(i);

            userService.save(user1);
        }
        return true;
    }
}
