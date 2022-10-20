package org.hulei.springboot2_hu.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.Hu
 * @create 2022/10/19 15:17
 */

/**
 * 收到请求“002.jpg"，先找Controller处理，Controller处理不了，再去找静态资源”002.jpg"
 * 静态资源找不到就显示404
 */

@RestController
public class HelloController {
    @RequestMapping("/002.jpg")
    public String hello(){

        return "Hello!这里是HelloController.java";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser(){
        return "GET-张三";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser(){
        return "POST-张三";
    }


//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser(){
        return "PUT-张三";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE-张三";
    }

    //扩展



}
