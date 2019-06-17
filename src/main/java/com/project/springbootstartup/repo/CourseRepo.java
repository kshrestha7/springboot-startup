package com.project.springbootstartup.repo;



import com.project.springbootstartup.model.CourseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepo extends CrudRepository<CourseModel, Integer> {

}
