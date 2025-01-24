package com.venky.crud.demo.dao;

import com.venky.crud.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    Student update(Student student);

    //void delete(int id);

    void delete(Student student);

    int deleteAll();

}
