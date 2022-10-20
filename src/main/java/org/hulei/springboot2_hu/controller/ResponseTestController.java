package org.hulei.springboot2_hu.controller;

import org.hulei.springboot2_hu.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author Mr.Hu
 * @create 2022/10/20 15:27
 */
@Controller
public class ResponseTestController {
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person = new Person();
        person.setAge(28);
        person.setBirth(new Date());
        person.setUserName("hu");
        return person;
    }
}
