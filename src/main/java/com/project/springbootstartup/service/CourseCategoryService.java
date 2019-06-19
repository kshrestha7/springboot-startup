package com.project.springbootstartup.service;

import com.project.springbootstartup.model.CourseCategory;
import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.repo.CourseCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseCategoryService {
    @Autowired
    private CourseCategoryRepo courseCategoryRepo;

    public List<CourseCategory> getAllCourseCategory() {

        List<CourseCategory> courseCategories = new ArrayList<>();
        return courseCategoryRepo.findAll();//.forEach(courseCategories::add);

    }

    public void addCourseCategory(CourseCategory courseCategory) {

        courseCategoryRepo.save(courseCategory);
    }


}
