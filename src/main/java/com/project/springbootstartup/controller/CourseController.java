package com.project.springbootstartup.controller;

import com.project.springbootstartup.model.CourseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    // your course controller goes here

@RequestMapping("/course")
    public List<CourseModel> getAllCourse(){
        CourseModel cm1 = new CourseModel("1","Computer","Learn Computer");
        CourseModel cm2 = new CourseModel("2","Java","Spring Boot");

        List<CourseModel> allCourse = new ArrayList<>();
        allCourse.add(cm1);
        allCourse.add(cm2);
        return allCourse;
    }
}
