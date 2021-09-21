package com.bjsxt.vueserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class VueServerController {
    // 简单的处理逻辑。支持跨域处理
    @RequestMapping("/test")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> test(String str1, String str2){
        Map<String,Object> map = new HashMap<>();
        map.put("status",200);
        map.put("str1","hello"+str1);
        map.put("str2","你好"+str2);
        return map;
    }

    @RequestMapping("/register")
    @ResponseBody
    @CrossOrigin
    public String register(String name,String pswd,String info,String[] hobbies,String gender){
        System.out.println(name+","+pswd+","+info+","+ Arrays.toString(hobbies)
                +","+gender);
        return "ok";
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    @CrossOrigin
    public List<Map<String,Object>> getUsers(){
        List<Map<String,Object>> result = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("name","尼古拉斯.赵四");
        map.put("age",42);
        map.put("address","铁岭");
        result.add(map);

        map = new HashMap<>();
        map.put("name","刘能");
        map.put("age",40);
        map.put("address","铁岭");
        result.add(map);

        map = new HashMap<>();
        map.put("name","谢大脚");
        map.put("age",38);
        map.put("address","铁岭");
        result.add(map);

        return result;
    }


}
