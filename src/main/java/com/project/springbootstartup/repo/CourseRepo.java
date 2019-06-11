package com.project.springbootstartup.repo;



import com.project.springbootstartup.model.CourseModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends MongoRepository<CourseModel, String>{

}
