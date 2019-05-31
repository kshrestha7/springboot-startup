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

    public List<CourseModel> getAllCourses() {
        return courseRepo.getAllCourse();

    }

    public CourseModel getCourse(String id) {
        return courseRepo.getCourseById(id);
    }

    public void addCourse(CourseModel course) {
        courseRepo.addCourse(course);
    }

    public void updateCourse(String id, CourseModel course) {
        courseRepo.updateCourse(id,course);

    }

    public void deleteCourse(String id) {
         courseRepo.deleteCourse(id);

    }

}
