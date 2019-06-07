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
        MockitoAnnotations.initMocks(this); //initialization
        // courseRepo = org.mockito.Mockito.mock(CourseRepo.class); //initialization another way
        when(courseRepo.getAllCourse()).thenReturn(getCourse());
    }

    @Test
    public void getAllCourse() {
        assertEquals(courseRepo.getAllCourse().size(), 10);
        verify(courseRepo, times(1)).getAllCourse();
    }

    @Test(expected = NullPointerException.class)
    public void getCourseByWrongID() {
        when(courseRepo.getCourseById("50")).thenReturn(getCourseByIdMock());
        assertEquals(courseRepo.getCourseById("51").getCourseDescription(), "Spring Boot");
        verify(courseRepo, times(1)).getCourseById(anyString());


    }


    @Test
    public void getCourseById() {

        when(courseRepo.getCourseById("50")).thenReturn(getCourseByIdMock());
        assertEquals(courseRepo.getCourseById("50").getCourseDescription(), "Spring Boot");
        verify(courseRepo, times(1)).getCourseById(anyString());


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

    //mocking object
    private List<CourseModel> getCourse() {
        List<CourseModel> courses = new ArrayList<>(Arrays.asList(new CourseModel("11", "Computer", "Learn Computer"),
                new CourseModel("12", "Java", "Spring Boot"), new CourseModel("13", "Angular", "Angular2"),
                new CourseModel("14", "Servlet", "Learn Servlet"), new CourseModel("15", "JSP", "Learn JSP"),
                new CourseModel("16", "Hibernate", "Learn Hibernate"), new CourseModel("17", "HTML", "Learn HTML"),
                new CourseModel("18", "CSS", "Learn CSS"), new CourseModel("19", "SQL", "Learn SQL"),
                new CourseModel("20", "MYSQL", "Learn MYSQL")));


        return courses;
    }

    private CourseModel getCourseByIdMock(){
        CourseModel cm = new CourseModel("50", "Java", "Spring Boot");
        return cm;
    }
    // you may need to create a several method
}