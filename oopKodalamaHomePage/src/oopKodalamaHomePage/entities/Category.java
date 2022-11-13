package oopKodalamaHomePage.entities;

public class Category {
	private int id;
	private String CategoryName;
	public Category() {
		super();
	}
	public Category(int id, String categoryName) {
		super();
		this.id = id;
		CategoryName = categoryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	

}
