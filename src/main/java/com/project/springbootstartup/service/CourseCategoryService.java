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
        courseCategoryRepo.findAll().forEach(courseCategories::add);
        return courseCategories;

    }

    public void addCourseCategoty(CourseCategory courseCategory) {

        courseCategoryRepo.save(courseCategory);
    }


}
