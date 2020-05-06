package com.ljc.learn.mongodb.dao;

import com.ljc.learn.mongodb.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {


    void save(Student student);

    void update(Student student);

    List<Student> findAll();

    void delete(Integer id);
}

