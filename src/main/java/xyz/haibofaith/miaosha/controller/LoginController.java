package xyz.haibofaith.miaosha.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.haibofaith.miaosha.model.LoginUser;
import xyz.haibofaith.miaosha.result.CodeMsg;
import xyz.haibofaith.miaosha.result.Result;
import xyz.haibofaith.miaosha.service.UserInfoSerivice;
import xyz.haibofaith.miaosha.util.MD5Util;

/**
 * @author:haibo.xiong
 * @date:2019/5/14
 * @description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserInfoSerivice userInfoSerivice;
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Result<LoginUser> login(@RequestBody LoginUser loginUser){
        logger.info("loginUser:"+loginUser.toString());
        LoginUser result = userInfoSerivice.getByUsername(loginUser.getUsername());
        if (result==null){
            return Result.error(CodeMsg.MOBILE_NOT_EXIST);
        }
        if (MD5Util.formPassToDBPass(loginUser.getPassword(),loginUser.getSalt()).equals(result.getPassword())){
            return Result.success(result);
        }else {
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
    }
}
