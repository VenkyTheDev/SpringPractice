package com.venky.CrudAdvancedMappingDemo;

import com.venky.CrudAdvancedMappingDemo.dao.AppDao;
import com.venky.CrudAdvancedMappingDemo.entity.Instructor;
import com.venky.CrudAdvancedMappingDemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAdvancedMappingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAdvancedMappingDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
//		return runner -> {
//			createInstructor(appDao);
//		};

//		return runner -> {
//			getInstructor(appDao);
//		};

//		return runner -> {
//			deleteInstructor(appDao);
//		};

//		return runner -> {
//			getInstructorDetails(appDao);
//		};

		return runner -> {
			deleteinstructorDetailsById(appDao);
		};
	}

	private void deleteinstructorDetailsById(AppDao appDao) {
		int InstructorDetailId = 5;
		System.out.println("Deleting instructor detail with id " + InstructorDetailId);
		appDao.deleteInstructorDetailById(InstructorDetailId);
		System.out.println("Deleted Instructor Detail Id: " + InstructorDetailId);
	}

	private void getInstructorDetails(AppDao appDao) {
		int instructorDetailId = 4;
		InstructorDetail instructorDetail = appDao.finInstructorDetailById(instructorDetailId);
		System.out.println("InstructorDetails: " + instructorDetail);
		System.out.println("Instructor :" + instructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDao appDao) {
		int InstructorId = 3;
		Instructor instructor = appDao.findInstructorById(InstructorId);
		System.out.println("Deleting instructor " + instructor);
		appDao.delete(InstructorId);
	}

	private void getInstructor(AppDao appDao) {
		int instructorId = 4;
		Instructor instructor = appDao.findInstructorById(instructorId);
		System.out.println(instructor);
	}

	public void createInstructor(AppDao appDao) {
		Instructor instructor = new Instructor("Venkata" , "Krishna" , "abc@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("https://www.venky.com/youtube" , "Development");
		instructor.setInstructorDetail(instructorDetail);
		appDao.save(instructor);
		System.out.println(instructor);
		System.out.println("Done creating Instructor");
	}
}
