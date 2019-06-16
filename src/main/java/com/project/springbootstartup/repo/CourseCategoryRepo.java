package com.project.springbootstartup.repo;

import com.project.springbootstartup.model.CourseCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseCategoryRepo extends CrudRepository<CourseCategory,Integer> {
}
