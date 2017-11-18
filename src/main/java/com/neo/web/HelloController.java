package com.neo.web;

import com.neo.entity.CESHI1;
import com.neo.service.CESHI1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @Resource
    CESHI1Service ceshi1Service;


    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
//        List<CESHI1> all = ceshi1Service.findAll();
//
//        for (CESHI1 s:all ) {
//            Date shijian = s.get时间();
//            System.out.print("时间:"+shijian);
//            System.out.print("温度:"+s.get温度());
//            System.out.println("压力:"+s.get压力());
//        }
        return "hello";
    }

    @RequestMapping("/index")
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}
