package com.project.springbootstartup.repo;

import com.project.springbootstartup.model.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sun.management.jdp.JdpPacket;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CourseCategoryRepo extends JpaRepository<CourseCategory,Integer> {
}
