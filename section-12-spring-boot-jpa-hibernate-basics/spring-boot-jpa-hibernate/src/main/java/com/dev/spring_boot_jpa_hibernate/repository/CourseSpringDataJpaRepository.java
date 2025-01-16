package com.dev.spring_boot_jpa_hibernate.repository;

import com.dev.spring_boot_jpa_hibernate.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);

}
