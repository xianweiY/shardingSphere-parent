/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: UserService
 * @Package com.atguigu.java.service
 * @author: apple
 * @date: 2019-07-20 11:24
 * @since JDK 1.8
 */
package com.atguigu.java.service;

import com.atguigu.java.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 * @ClassName : UserService
 * @AUTHOR :  apple
 * @DATE :    2019-07-20 11:24  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
public interface UserService extends IService<User> {


    /**
     * 保存用户信息
     *
     * @param entity
     * @return
     */
    @Override
    boolean
    save(User entity);


    /**
     * 查询全部用户信息
     *
     * @return
     */
    List<User> getUserList();
}
