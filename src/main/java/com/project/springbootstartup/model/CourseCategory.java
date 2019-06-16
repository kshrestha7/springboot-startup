package com.project.springbootstartup.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class CourseCategory {
    public CourseCategory(String name) {
        this.name = name;
    }

    public CourseCategory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private int id;
    private String name ;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    private List<CourseModel> courseModel = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseModel> getCourseModels() {
        return courseModel;
    }

    public void setCourseModels(List<CourseModel> courseModels) {
        this.courseModel = courseModels;
    }
}
