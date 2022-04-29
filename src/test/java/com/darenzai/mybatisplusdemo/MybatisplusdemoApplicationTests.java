package com.darenzai.mybatisplusdemo;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.darenzai.mybatisplusdemo.bean.User;
import com.darenzai.mybatisplusdemo.dao.UserDao;
import com.darenzai.mybatisplusdemo.serivce.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisplusdemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

        Integer integer = userDao.selectCount(null);
        System.out.println(integer);
    }

    @Test
    public void testfindAll(){
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testFind(){

        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        queryWrapper.eq("age",23);
        List<User> users = userDao.selectList(queryWrapper);
        System.out.println(users);

    }


    // 模糊查询
    @Test
    public void testmohu(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("name", "");
        List<User> users = userDao.selectList(queryWrapper);
        users.forEach(user -> System.out.println("user = " + user));
    }

    @Test
    public void testFindOne(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        User user = userDao.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    public void testMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        userDao.selectByMap(map).forEach(user -> System.out.println("user :"+user ));
    }

    @Test
    public void testPage(){
        IPage<User> page = new Page<>(1, 2);
        IPage<User> userIPage = userDao.selectPage(page, null);
        userIPage.getRecords().forEach(user -> System.out.println("user = " + user));
    }

    // 保存
    @Test
    public void testSave(){
        User entity = new User();
        entity.setAge(23);
        userDao.insert(entity);
    }

    @Test
    public void testUpdate(){
        User user = userDao.selectById(1);
        user.setAge(99);
        user.setName("小胡");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        userDao.update(user, queryWrapper);
    }
    // 删除
    @Test
    public void testDeleteById(){
        userDao.deleteById("3");
    }

    @Test
    @DS("myemployees_1")
    public void findDsAll(){
        List<User> users = userDao.selectList(null);
        users.forEach(user -> System.out.println(user));

    }

    @Test
    public void test(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }


}
