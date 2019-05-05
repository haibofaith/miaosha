package xyz.haibofaith.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
