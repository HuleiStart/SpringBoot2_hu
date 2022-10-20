package org.hulei.springboot2_hu.controller;

import org.hulei.springboot2_hu.bean.Person;
import org.springframework.web.bind.annotation.*;
import sun.management.Agent;
import sun.management.resources.agent;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.Hu
 * @create 2022/10/20 8:14
 */
@RestController
public class ParameterTestController {

    /**
     * 数据绑定，页面提交的请求数据（POST，GET）都可以喝对象属性进行绑定
     * @param person
     * @return
     */
    @PostMapping("/saveuser")
    public Person saveuser(Person person){
        return person;
    }

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("user-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") String age,
                                     @RequestParam("girlfriend") String girlfriend,
                                     @RequestParam("inters") List<String> inters,
                                     @RequestParam Map<String,String> param
                                     /*@CookieValue("_ga") String _ga,
                                     @CookieValue("_ga") Cookie cookie*/
                                     ){
        Map<String,Object> map = new HashMap<>();
        /*map.put("name",name);
        map.put("pv",pv);
        map.put("id",id);
        map.put("useragent",userAgent);
        map.put("headers",header);*/
        map.put("inters",inters);
        map.put("age",age);
        map.put("girlfriend",girlfriend);
        map.put("params",param);
        /*map.put("_ga",_ga);
        System.out.println(cookie);*/
        return map;
    }

    @PostMapping("/save")
    public Map postMrthod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }
}
