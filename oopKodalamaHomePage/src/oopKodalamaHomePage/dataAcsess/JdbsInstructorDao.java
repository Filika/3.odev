package oopKodalamaHomePage.dataAcsess;


import oopKodalamaHomePage.entities.Instructor;

public class JdbsInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName()+" "+"eğitmen olarak JDBC ile veritabanına eklendi.");

	}
	

}
