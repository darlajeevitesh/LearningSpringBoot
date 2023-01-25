package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {

		return Arrays.asList(
				new Course(1, "Learn Spring", "in28minutes"),
				new Course(2, "Learn Functional Programming", "Ranga"),
				new Course(3, "Learn Azure", "Ranga Karanam"),
				new Course(4, "Learn ADF", "Ranga Karanam"),
				new Course(5, "Learn GCP", "Ranga Karanam"),
				new Course(6, "Learn AWS", "Ranga Karanam")

		);
	}

}
