package com.venky.Crud_Practice.rest;

import com.venky.Crud_Practice.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadStudents(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("John","Doe"));
        theStudents.add(new Student("Jane","Elwis"));
        theStudents.add(new Student("Jack","Ma"));
    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/student/{StudentId}")
    public Student getStudent(@PathVariable int StudentId){
        if(StudentId >= theStudents.size() || StudentId < 0){
            throw new StudentNotFoundException("StudentId not found - " + StudentId);
        }
        return theStudents.get(StudentId);
    }


}
