package com.springboot.learn_spring_boot.couses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn_spring_boot.couses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
//		return Arrays.asList(new Course(1, "Learn Spring boot", "Ayush"));
		return List.of(new Course(1, "Learn Spring", "Ayush"), new Course(2, "Learn Spring boot", "Ayush"));
	}

	@GetMapping("/courses/1")
	public Course getCourse1() {
		return new Course(3, "Learn Full stack", "Udemy");
	}

	@GetMapping("/courses/2")
	public Course getCourse2() {
		return new Course(4, "Learn MERN stack", "Udemy");
	}
}
