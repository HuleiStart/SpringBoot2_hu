package org.hulei.springboot2_hu.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mr.Hu
 * @create 2022/10/20 16:25
 */
@Controller
public class ViewTestController {
    @GetMapping("/mrhulei")
    public String mrhulei(Model model){
        model.addAttribute("msg","你好，世界！");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
