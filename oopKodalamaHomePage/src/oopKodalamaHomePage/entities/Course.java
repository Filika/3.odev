package oopKodalamaHomePage.entities;

public class Course {
	private int id;
	private String CourseName;
	private double CoursePrice;
	public Course() {
		super();
	}
	public Course(int id, String courseName, double coursePrice) {
		super();
		this.id = id;
		CourseName = courseName;
		CoursePrice = coursePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public double getCoursePrice() {
		return CoursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	

}
