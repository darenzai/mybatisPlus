package com.darenzai.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.darenzai.mybatisplusdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<User> {
}
