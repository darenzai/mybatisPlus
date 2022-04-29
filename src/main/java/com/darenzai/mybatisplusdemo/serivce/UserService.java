package com.darenzai.mybatisplusdemo.serivce;

import com.darenzai.mybatisplusdemo.bean.User;

import java.util.List;

public interface UserService {
    List<User>  findAll();

}
