package com.first.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entity.Course;
import com.first.repo.CourseRepository;
import com.first.service.CourseService;

@Service
public class CourseServiceIMPL implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) { // insert or update based on Primary key
		courseRepo.save(course);
		return "Success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = courseRepo.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Success";
		} else {
			return "Record not found";
		}

	}

}
