package com.wjl.controller;

import com.wjl.domain.Dept;
import com.wjl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public Dept findById(@PathVariable("id") int id){
        Dept dept = deptService.findById(id);
        return dept;
    }
}
