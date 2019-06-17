package com.project.springbootstartup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.service.CourseService;

@RestController
public class CourseController {
	// your course controller goes here
	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<CourseModel> getAllCourse() {

		return courseService.getAllCourses();
	}

	

	@GetMapping("/course/{id}")
	public Optional<CourseModel> getCourse(@PathVariable int id) {
		return courseService.getCourse(id);

	}

	@PostMapping("/course")
	public void addCourse(@RequestBody CourseModel course) {
		courseService.addCourse(course);

	}

/*	@PutMapping("/course/{id}")
	public void updateCourse(@RequestBody CourseModel course) {
		courseService.updateCourse(course);

	}

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);

	}*/
}
