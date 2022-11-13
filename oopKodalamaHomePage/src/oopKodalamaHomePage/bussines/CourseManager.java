package oopKodalamaHomePage.bussines;

import oopKodalamaHomePage.core.logging.Logger;
import oopKodalamaHomePage.dataAcsess.CourseDao;
//import oopKodalamaHomePage.dataAcsess.JdbsCourseDao;
import oopKodalamaHomePage.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[]loggers;
	public CourseManager(CourseDao courseDao, Logger[]loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers =loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception(course.getCoursePrice() + " " + "Kurs  ücreti 0'dan küçük olamaz ");

		}
		if (course.getCourseName().equals(course.getCourseName() + " " + "Kurs adı zaten kayıtlı tekrar edemez.")) {
			
		}
		
		//JdbsCourseDao courseDao = new JdbsCourseDao();
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
			
		}
	}

	

}
