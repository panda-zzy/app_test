package com.ht17.app_test.controller;

import com.ht17.app_test.dao.UserDao;
import com.ht17.app_test.pojo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panda
 * @create 2022-11-17:06
 */
@Api(tags = "测试控制层接口")
@RestController
@RequestMapping("/base")
@Slf4j
public class BaseController {

    @Autowired
    public UserDao userDao;
    @ApiOperation(value = "基本接口", notes = "基本接口测试")
//    @ApiImplicitParam(paramType = "path",name = "uid",value = "测试ID",dataType = "String")
    @GetMapping("/baseController/{id}")
    public String baseController(@PathVariable int id){

        User user = userDao.selectById(1);
        System.out.println(user);
        return "test";
    }
}
