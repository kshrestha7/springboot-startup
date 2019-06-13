package com.project.springbootstartup.repo;



import com.project.springbootstartup.model.CourseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<CourseModel, String> {

}
