package com.project.springbootstartup.repo;

import com.project.springbootstartup.model.CourseModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CourseRepoTest {

    @Mock
    CourseRepo courseRepo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        // courseRepo = org.mockito.Mockito.mock(CourseRepo.class);
        when(courseRepo.getAllCourse()).thenReturn(getCourse());
    }

    @Test
    public void getAllCourse() {
        assertEquals(courseRepo.getAllCourse().size(), 10);
        verify(courseRepo, times(1)).getAllCourse();
    }

    @Test
    public void getCourseById() {
        // TODO add test case for couseById
    }

    @Test
    public void addCourse() {
        // TODO add test case for add course
    }

    @Test
    public void deleteCourse() {
        // TODO add test case for delete course
    }

    @Test
    public void updateCourse() {
        // TODO add test case for update course
    }
    // you may need to create a several test method

    public List<CourseModel> getCourse() {
        List<CourseModel> courses = new ArrayList<>(Arrays.asList(new CourseModel("1", "Computer", "Learn Computer"),
                new CourseModel("2", "Java", "Spring Boot"), new CourseModel("3", "Angular", "Angular2"),
                new CourseModel("4", "Servlet", "Learn Servlet"), new CourseModel("5", "JSP", "Learn JSP"),
                new CourseModel("6", "Hibernate", "Learn Hibernate"), new CourseModel("7", "HTML", "Learn HTML"),
                new CourseModel("8", "CSS", "Learn CSS"), new CourseModel("9", "SQL", "Learn SQL"),
                new CourseModel("10", "MYSQL", "Learn MYSQL")));


        return courses;
    }
    // you may need to create a several method
}