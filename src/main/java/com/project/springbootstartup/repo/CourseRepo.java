package com.project.springbootstartup.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethods;

import com.project.springbootstartup.model.CourseModel;

public interface CourseRepo extends MongoRepository<CourseModel, String> {
	/*private List<CourseModel> courses = Arrays.asList(new CourseModel("1", "Computer", "Learn Computer"),
			new CourseModel("2", "Java", "Spring Boot"), new CourseModel("3", "Angular", "Angular2"),
			new CourseModel("4", "Servlet", "Learn Servlet"), new CourseModel("5", "JSP", "Learn JSP"),
			new CourseModel("6", "Hibernate", "Learn Hibernate"), new CourseModel("7", "HTML", "Learn HTML"),
			new CourseModel("8", "CSS", "Learn CSS"), new CourseModel("9", "SQL", "Learn SQL"),
			new CourseModel("10", "MYSQL", "Learn MYSQL"));
*/
}
