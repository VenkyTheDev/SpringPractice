package com.venky.CrudAdvancedMappingDemo.dao;

import com.venky.CrudAdvancedMappingDemo.entity.Instructor;

public interface AppDao {
    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void delete(int id);
}
