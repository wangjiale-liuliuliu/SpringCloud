package com.wjl.service;

import com.wjl.domain.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept findById(int id);

    List<Dept> findAll();
}
