package com.xm.testModel.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xm.mapper.StudentMapper;
import com.xm.testModel.entity.User;
import com.xm.testModel.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2018-11-06
 */
@RestController
@RequestMapping("/testModel/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/test")
    public void test(){
      /*  IPage<User> page = new Page(1,10,1L);
        page =  userMapper.selectPage(page,null);
        List<User> users = page.getRecords();*/
        System.out.println(studentMapper.selectList(null));
     }
}
