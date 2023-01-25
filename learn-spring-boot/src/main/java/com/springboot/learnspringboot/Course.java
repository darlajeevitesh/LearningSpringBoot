package com.springboot.learnspringboot;

public class Course {

	private long id;
	private String courseName;
	private String courseAuthor;

	public void setId(int id) {
		this.id = id;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}

	public long getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseAuthor() {
		return courseAuthor;
	}

	public Course(long id, String courseName, String courseAuthor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseAuthor = courseAuthor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseAuthor=" + courseAuthor + "]";
	}

}
