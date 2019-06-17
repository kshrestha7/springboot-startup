package com.project.springbootstartup.model;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="COURSE")
public class CourseModel {
    // your course model goes here

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private String courseDescription;
    @Column(name = "categoryId")
    private String categoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public CourseModel setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public int getCourseId() {
        return courseId;
    }

    public CourseModel setCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseModel setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }


}
