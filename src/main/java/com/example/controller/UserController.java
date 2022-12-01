package com.example.controller;

import com.example.common.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/users")
    @ApiOperation(value = "查询所有的用户")
    public R<String> getUsers(){
        return R.success("所有的用户");
    }
}
