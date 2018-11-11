package com.spike.controller;

import com.spike.utils.result.CodeMsg;
import com.spike.utils.result.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: guifang.weng
 * @Date: 2018/11/11 4:04 PM
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/spike_success")
    public Result<String> success() {
        return Result.SUCCESS("hello world!");
    }

    @GetMapping("/spike_error")
    public Result<String> error() {
        return Result.ERROR(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name","spike");
        return "index";
    }
}
