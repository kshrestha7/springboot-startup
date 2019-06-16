package com.project.springbootstartup;

import com.project.springbootstartup.repo.CourseCategoryRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStartupApplication  {
	@Autowired
	private CourseCategoryRepo courseCategoryRepo;
	private static final Logger logger = LoggerFactory.getLogger(SpringbootStartupApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootStartupApplication.class, args);
	}

	/*@Override
	@Transactional
	public void run(String... strings) throws Exception {
		// save a couple of categories
		final CourseCategory categoryA = new CourseCategory();

		List<CourseModel> courseModels = new ArrayList<>();
		courseModels.add(new CourseModel("Machine Learning","Machine Learning",categoryA));
		courseModels.add(new CourseModel("Java","Java",categoryA));
		courseModels.add(new CourseModel("Block Chain","Block Chain",categoryA));
		categoryA.setCourseModels(courseModels);

		final CourseCategory categoryB = new CourseCategory();
		List<CourseModel> courseModels1 = new ArrayList<>();
		courseModels1.add(new CourseModel("Account","Learn Account",categoryA));
		courseModels1.add(new CourseModel("Economics","Learn Economics",categoryA));

		courseModels1.add(new CourseModel("Finance","Learn Finance",categoryA));
		categoryA.setCourseModels(courseModels1);

		courseCategoryRepo.saveAll(Arrays.asList(categoryA, categoryB));

		// fetch all categories
		for (CourseCategory bookCategory : courseCategoryRepo.findAll()) {
			logger.info(bookCategory.toString());
		}
	}
*/
}
