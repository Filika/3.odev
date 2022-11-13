package oopKodalamaHomePage.dataAcsess;

import oopKodalamaHomePage.entities.Category;

public class JdbsCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " " + "kategorisi jdbc ile eklendi");

	}
	

}
