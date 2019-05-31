package com.project.springbootstartup.service;

import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.repo.CourseRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
    public List<CourseModel> getAllCourses(){
    	List<CourseModel> courses = new ArrayList<>();
    	courseRepo.findAll().forEach(courses::add);
    	
		
		return courses;
	}

    public CourseModel getCourse() {
        return null;
    }
    // Your Course Service Goes here
	public CourseModel getCourse(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addCourse(CourseModel course) {
		// TODO Auto-generated method stub
		
	}
	public void updateCourse(String id, CourseModel course) {
		// TODO Auto-generated method stub
		
	}
	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		
	}

}
