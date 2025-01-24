package com.venky.crud.demo;

import com.venky.crud.demo.dao.StudentDAO;
import com.venky.crud.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner->{
//			createStudent(studentDAO);
//		};

		return runner -> {
			createMultipleStudents(studentDAO);
		};

//		return runner -> {
//			retriveStudent(studentDAO);
//		};

//		return runner -> {
//			retrieveAllStudents(studentDAO);
//		};

//		return runner -> {
//			retrieveByLastName(studentDAO);
//		};

//		return runner -> {
//			updateStudent(studentDAO);
//		};

//		return runner -> {
//			deleteStudent(studentDAO);
//		};

//		return runner -> {
//			deleteAllStudents(studentDAO);
//		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int rows = studentDAO.deleteAll();
		System.out.println("Deleted all students , # of rows effected : " + rows);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id = 3;
		Student student = studentDAO.findById(id);
		studentDAO.delete(student);
		System.out.println("Deleted student " + student);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student oldStudentData = studentDAO.findById(1);
		Student newStudentData = studentDAO.findById(1);
		newStudentData.setLastName("Polisetty");
		newStudentData =  studentDAO.update(newStudentData);
		System.out.println("Old student data: " + oldStudentData + " New student data: " + newStudentData);
	}

	private void retrieveByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("krishna");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void retrieveAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void retriveStudent(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student = new Student("Venky" , "Pvk" , "abcd@gmail.com");
		studentDAO.save(student);
		System.out.println("Saving student...");
		int studentId = student.getId();
		System.out.println("Saved Student with id: " + studentId);
		Student retrievedStudent = studentDAO.findById(studentId);
		System.out.println("Retrieved Student: " + retrievedStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student1 = new Student("Venky" , "Pvk" , "abcd@gmail.com");
		Student student2 = new Student("Rama" , "Krishna" , "abcde@gmail.com");
		Student student3 = new Student("Hari" , "Krishna" , "abcdef@gmail.com");
		System.out.println("Creating students...");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
		System.out.println("Done!");
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student = new Student("Venkata" , "Krishna" , "abc@gmail.com");
		System.out.println("Saving student...");
		studentDAO.save(student);
		System.out.println("Saved student. Student ID: " + student.getId());
	}
}
