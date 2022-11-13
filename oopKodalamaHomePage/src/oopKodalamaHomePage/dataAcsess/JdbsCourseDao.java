package oopKodalamaHomePage.dataAcsess;

import oopKodalamaHomePage.entities.Course;

public class JdbsCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println(course.getCourseName()+" "+"Kursu Jdbc ile veri tabanına eklendi" );
	}

}
