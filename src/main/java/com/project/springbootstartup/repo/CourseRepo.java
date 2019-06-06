package com.project.springbootstartup.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.project.springbootstartup.model.CourseModel;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepo {
    List<CourseModel> courses = new ArrayList<>(Arrays.asList(new CourseModel("1", "Computer", "Learn Computer"),
            new CourseModel("2", "Java", "Spring Boot"), new CourseModel("3", "Angular", "Angular2"),
            new CourseModel("4", "Servlet", "Learn Servlet"), new CourseModel("5", "JSP", "Learn JSP"),
            new CourseModel("6", "Hibernate", "Learn Hibernate"), new CourseModel("7", "HTML", "Learn HTML"),
            new CourseModel("8", "CSS", "Learn CSS"), new CourseModel("9", "SQL", "Learn SQL"),
            new CourseModel("10", "MYSQL", "Learn MYSQL")));

    public List<CourseModel> getAllCourse() {

        return courses;
    }

    public CourseModel getCourseById(String id) {

        return courses.stream().filter(c -> c.getCourseId().equals(id)).findFirst().get();
    }

    public void addCourse(CourseModel courseModel) {
        courses.add(courseModel);
    }

    public void deleteCourse(String id) {
    }

    public void updateCourse(String id, CourseModel course) {

    }
}
