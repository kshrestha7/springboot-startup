package com.project.springbootstartup.controller;

import com.project.springbootstartup.model.CourseCategory;
import com.project.springbootstartup.model.CourseModel;
import com.project.springbootstartup.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @PostMapping(value = "/addCourseCategory")
    public List<CourseCategory> addCourseCategory(@RequestBody CourseCategory courseCategory) {
        List<CourseModel> cm = new ArrayList<>();
        if(courseCategory.getCourseModels().size() >0){
            for (int i = 0; i < courseCategory.getCourseModels().size(); i++) {
                CourseModel courseModel = new CourseModel();
                courseModel.setCourseDescription(courseCategory.getCourseModels().get(i).getCourseDescription());
                courseModel.setCourseName(courseCategory.getCourseModels().get(i).getCourseName());
                cm.add(courseModel);
            }
        }
        CourseCategory courseCategory1 = new CourseCategory();
        courseCategory1.setName(courseCategory.getName());
        courseCategory1.setCourseModels(cm);



        //Save Course Category
        courseCategoryService.addCourseCategory(courseCategory1);


        //Return the the save item

        return courseCategoryService.getAllCourseCategory();


    }


}
