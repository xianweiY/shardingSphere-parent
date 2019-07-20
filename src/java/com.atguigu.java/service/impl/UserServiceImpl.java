/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: UserServiceImpl
 * @Package com.atguigu.java.service.impl
 * @author: apple
 * @date: 2019-07-20 11:24
 * @since JDK 1.8
 */
package com.atguigu.java.service.impl;

import com.atguigu.java.dao.UserMapper;
import com.atguigu.java.entity.User;
import com.atguigu.java.service.UserService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : UserServiceImpl
 * @AUTHOR :  apple
 * @DATE :    2019-07-20 11:24
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }
}
