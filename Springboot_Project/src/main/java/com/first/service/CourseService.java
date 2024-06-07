package com.first.service;

import java.util.List;

import com.first.entity.Course;

public interface CourseService {
	//insert + update
	public String upsert(Course course);
	public Course getById(Integer cid);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);

}
