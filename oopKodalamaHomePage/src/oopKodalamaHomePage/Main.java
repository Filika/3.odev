package oopKodalamaHomePage;

import oopKodalamaHomePage.bussines.CategoryManeger;
import oopKodalamaHomePage.bussines.CourseManager;
import oopKodalamaHomePage.bussines.InstructorManeger;
import oopKodalamaHomePage.core.logging.DatabaseLogger;
import oopKodalamaHomePage.core.logging.FileLogger;
import oopKodalamaHomePage.core.logging.Logger;
import oopKodalamaHomePage.dataAcsess.HibernateCategoryDao;       
import oopKodalamaHomePage.dataAcsess.HibernateCourseDao;
import oopKodalamaHomePage.dataAcsess.HibernateInstructorDao;
import oopKodalamaHomePage.entities.Category;
import oopKodalamaHomePage.entities.Course;   
import oopKodalamaHomePage.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		

		Course course = new Course(1, "JAVA", 200);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		
		
		Category category = new Category(1,"programlama");
		CategoryManeger categoryManeger = new CategoryManeger(new HibernateCategoryDao(), loggers);
		categoryManeger.add(category);
		
		
		Instructor instructor = new Instructor(1,"Filiz","Aydın","java");
		InstructorManeger instructorManeger = new InstructorManeger(new HibernateInstructorDao());
		instructorManeger.add(instructorManeger);
		
		
	}

}
