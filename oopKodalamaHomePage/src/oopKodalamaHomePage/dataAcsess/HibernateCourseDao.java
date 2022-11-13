package oopKodalamaHomePage.dataAcsess;

import oopKodalamaHomePage.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println(course.getCourseName()+" "+"Kursu Hibernate ile veri tabanına eklendi" );
	}
}
