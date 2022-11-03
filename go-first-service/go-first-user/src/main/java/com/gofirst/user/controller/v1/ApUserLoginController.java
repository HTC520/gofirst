package com.gofirst.user.controller.v1;

import com.gofirst.model.common.dtos.ResponseResult;
import com.gofirst.model.user.dtos.LoginDto;
import com.gofirst.user.service.ApUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : KKQ  2022/11/3 0003 15:49 我是中国人，我爱自己的祖国
 * @apiNote : 用户登录
 **/
@Api(value = "用户登录", tags = "UserLogin", description = "用户登录展示API")
@RestController
@RequestMapping("/api/v1/login")
public class ApUserLoginController {

    @Autowired
    private ApUserService apUserService;
    
    @PostMapping("/login_auth")
    @ApiOperation("用户登录")
    public ResponseResult login(@RequestBody LoginDto dto) {
        return apUserService.login(dto);
    }
}
