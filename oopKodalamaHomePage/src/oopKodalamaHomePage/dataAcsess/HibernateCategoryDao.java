package oopKodalamaHomePage.dataAcsess;

import oopKodalamaHomePage.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " " + "kategorisi Hibernate ile eklendi");

	}

}
