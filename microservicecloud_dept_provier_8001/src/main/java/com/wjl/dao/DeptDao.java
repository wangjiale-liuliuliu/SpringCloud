package com.wjl.dao;

import com.wjl.domain.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {
    @Insert("INSERT INTO dept values(null,#{dname},#{db_source})")
    boolean addDept(Dept dept);
    @Select("SELECT * FROM dept WHERE deptno=#{id}")
    Dept findById(int id);
    @Select("SELECT * FROM dept")
    List<Dept> findAll();
}
