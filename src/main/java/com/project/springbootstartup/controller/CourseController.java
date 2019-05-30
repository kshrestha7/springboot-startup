package com.project.springbootstartup.controller;

import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    // your course controller goes here
    @Autowired
    private CourseService courseService;

@RequestMapping("/course")
    public List<CourseModel> getAllCourse(){

        return courseService.getAllCourses();
    }

    @RequestMapping("/courseId")
    public CourseModel getCourseById(){

        return courseService.getCourse();
    }
}
