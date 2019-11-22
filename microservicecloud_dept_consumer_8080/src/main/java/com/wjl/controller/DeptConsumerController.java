package com.wjl.controller;

import com.wjl.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {
//    public static final String URL_PREFIX="http://localhost:8001/";
    public static final String URL_PREFIX="http://MICROSERVICECLOUD-DEPT/";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/findall",method = RequestMethod.GET)
    public List<Dept> findAll(){
        System.out.println("consumer查询所有");
        return restTemplate.getForObject(URL_PREFIX+"/dept/findall",List.class);
    }
    @RequestMapping(value = "/findbyid/{id}",method = RequestMethod.GET)
    public Dept findById(@PathVariable("id") int id){
        return restTemplate.getForObject(URL_PREFIX+"/dept/findbyid/"+id,Dept.class);
    }
}
