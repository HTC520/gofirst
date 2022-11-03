package com.gofirst.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gofirst.model.common.dtos.ResponseResult;
import com.gofirst.model.user.dtos.LoginDto;
import com.gofirst.model.user.pojos.ApUser;

/**
 * @author : KKQ  2022/11/3 0003 15:53 我是中国人，我爱自己的祖国
 * @apiNote : 用户service
 **/
public interface ApUserService extends IService<ApUser> {

    /**
     * app端登录
     *
     * @param dto 参数
     * @return ResponseResult
     */
    ResponseResult login(LoginDto dto);

}
