package com.darenzai.mybatisplusdemo.serivce.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.darenzai.mybatisplusdemo.bean.User;
import com.darenzai.mybatisplusdemo.dao.UserDao;
import com.darenzai.mybatisplusdemo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @DS("slave_1")
    public List<User> findAll(){

        return userDao.selectList(null);
    }

}
