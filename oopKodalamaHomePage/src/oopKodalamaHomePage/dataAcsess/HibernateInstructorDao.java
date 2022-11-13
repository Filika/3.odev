package oopKodalamaHomePage.dataAcsess;

import oopKodalamaHomePage.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName()+" "+"eğitmen olarak Hibernate ile veritabanına eklendi.");

	}
	

}
