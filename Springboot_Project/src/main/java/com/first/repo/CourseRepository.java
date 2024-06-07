package com.first.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable>{

}
