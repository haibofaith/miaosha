package xyz.haibofaith.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.haibofaith.miaosha.model.UserInfo;
import xyz.haibofaith.miaosha.redis.RedisService;
import xyz.haibofaith.miaosha.result.CodeMsg;
import xyz.haibofaith.miaosha.result.Result;
import xyz.haibofaith.miaosha.service.UserInfoSerivice;


/**
 * @author:haibo.xiong
 * @date:2019/5/5
 * @description:
 */
@Controller
@RequestMapping("/demo")
public class SampleController {
    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","haibo");
        return "hello";
    }

    @Autowired
    UserInfoSerivice userInfoSerivice;

    @RequestMapping("/dbGet")
    @ResponseBody
    public Result<UserInfo> dbGet(){
        UserInfo userInfo = userInfoSerivice.getById(1);
        return Result.success(userInfo);
    }


    @RequestMapping("/dbTx")
    @ResponseBody
    public Result<Boolean> dbTx(){
        boolean b = userInfoSerivice.tx();
        return Result.success(b);
    }

    @Autowired
    private RedisService redisService;

    @RequestMapping("/redisGet")
    @ResponseBody
    public Result<String> redisGet(){
        Long value = redisService.get("key1",Long.class);
        return Result.success(value.toString());
    }

    @RequestMapping("/redisSet")
    @ResponseBody
    public Result<String> redisSet(){
        boolean b = redisService.set("key2","hello,bobo");
        String value = redisService.get("key2",String.class);
        return Result.success(value);
    }

}
