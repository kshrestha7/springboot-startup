package com.project.springbootstartup.controller;

import com.project.springbootstartup.model.CourseCategory;
import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/courseCategory")
public class CourseCategoryController {

    @Autowired
    private CourseCategoryService courseCategoryService;

    @GetMapping(value = "/all")
    public List<CourseCategory> getAllCourse() {

        return courseCategoryService.getAllCourseCategory();
    }

   /* @PostMapping(value = "/courseCategory")
    public void addCourseCategory(@RequestBody CourseCategory courseCategory) {
        courseCategoryService.addCourseCategoty(courseCategory);

    }*/

    @GetMapping(value = "/updateCategory/{name}")
    public List<CourseCategory> updtaeCategory(@PathVariable String name){

        CourseModel courseModel = new CourseModel();
        courseModel.setCourseName("Computer Science")
                .setCourseDescription("learnComputer");

        CourseModel courseModel1 = new CourseModel();
        courseModel1.setCourseName("System Architecture")
                .setCourseDescription("Learn System Architecture");


        CourseCategory courseCategory = new CourseCategory();
        courseCategory.setName(name);
        courseCategory.setCourseModels(Arrays.asList(courseModel,courseModel1));

        //Save Course Category
        courseCategoryService.addCourseCategoty(courseCategory);


        //Rerurn the the save item

        return courseCategoryService.getAllCourseCategory();




    }


}
