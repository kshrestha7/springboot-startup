package com.project.springbootstartup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.service.CourseService;

@RestController
public class CourseController {
	// your course controller goes here
	@Autowired
	private CourseService courseService;

	@RequestMapping("/course")
	public List<CourseModel> getAllCourse() {

		return courseService.getAllCourses();
	}

	

	@RequestMapping("/course/{id}")
	public Optional<CourseModel> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public void addCourse(@RequestBody CourseModel course) {
		courseService.addCourse(course);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/course/{id}")
	public void updateCourse(@RequestBody CourseModel course) {
		courseService.updateCourse(course);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);

	}
}
