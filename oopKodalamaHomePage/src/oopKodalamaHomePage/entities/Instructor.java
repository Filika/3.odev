package oopKodalamaHomePage.entities;

public class Instructor {
	private int id;
	private String InstructorFirstName;
	private String InstructorLastName;
	private String InstructorBranch;
	public Instructor() {
		super();
	}
	public Instructor(int id, String instructorFirstName, String instructorLastName, String instructorBranch) {
		super();
		this.id = id;
		InstructorFirstName = instructorFirstName;
		InstructorLastName = instructorLastName;
		InstructorBranch = instructorBranch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstructorFirstName() {
		return InstructorFirstName;
	}
	public void setInstructorFirstName(String instructorFirstName) {
		InstructorFirstName = instructorFirstName;
	}
	public String getInstructorLastName() {
		return InstructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		InstructorLastName = instructorLastName;
	}
	public String getInstructorBranch() {
		return InstructorBranch;
	}
	public void setInstructorBranch(String instructorBranch) {
		InstructorBranch = instructorBranch;
	}


}