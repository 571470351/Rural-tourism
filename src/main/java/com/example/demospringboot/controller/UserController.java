package com.example.demospringboot.controller;

import com.example.demospringboot.entity.http.Resp;
import com.example.demospringboot.entity.User;
import com.example.demospringboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "用户登录")
@RequestMapping("/api/user")
@RestController
public class UserController {

    @Resource
    UserService  userService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/usrlogin")
    public Resp login(@RequestParam String name,String pwd){


        return Resp.success("账号密码错误",null);

    }

    @ApiOperation(value = "增加用户")
    @PostMapping("/add")
    public Resp add(@RequestBody User user){

        return Resp.success(userService.insertSelective(user));

    }

    @ApiOperation(value = "删除用户")
    @PostMapping("/delete")
    public Resp delete(@RequestParam Integer id){

        return Resp.success(userService.deleteByPrimaryKey(id));

    }

    @ApiOperation(value = "修改用户")
    @PostMapping("/update")
    public Resp update(@RequestBody User user){

        return Resp.success(userService.updateByPrimaryKeySelective(user));

    }

    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping("/info")
    public Resp info(@RequestParam Integer id){
            return Resp.success("操作成功", userService.selectByPrimaryKey(id));
    }

}
