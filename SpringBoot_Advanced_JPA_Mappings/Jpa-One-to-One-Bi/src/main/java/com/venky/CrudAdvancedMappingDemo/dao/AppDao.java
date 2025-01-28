package com.venky.CrudAdvancedMappingDemo.dao;

import com.venky.CrudAdvancedMappingDemo.entity.Instructor;
import com.venky.CrudAdvancedMappingDemo.entity.InstructorDetail;

public interface AppDao {
    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void delete(int id);

    InstructorDetail finInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);
}
