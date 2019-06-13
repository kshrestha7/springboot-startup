package com.project.springbootstartup.model;



import javax.persistence.*;

@Entity
@Table(name="COURSE")
public class CourseModel {
    // your course model goes here


    @Id
    @GeneratedValue
    @Column(name="COURSE_ID")
    private String courseId;
    @Column(name="COURSE_NAME")
    private String courseName;
    @Column(name="COURSE_DESCRIPTION")
    private String courseDescription;

    public CourseModel(){

    }
    public CourseModel(String courseId, String courseName, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
