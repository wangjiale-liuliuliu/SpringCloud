package com.wjl.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wjl.domain.Dept;
import com.wjl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class LoginController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/findall")
    public List<Dept> test01(){
        List<Dept> all = deptService.findAll();
        return all;
    }
    @RequestMapping("/findbyid/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept findById(@PathVariable("id") int id){
        Dept dept = deptService.findById(id);
        if(dept==null){
            throw new RuntimeException("qwerty");
        }
        return dept;
    }
    public Dept processHystrix(@PathVariable("id") int id){
        Dept dept = new Dept(null,"错了",null);
        return dept;
    }
}
