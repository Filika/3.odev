package oopKodalamaHomePage.bussines;

import oopKodalamaHomePage.core.logging.Logger;
import oopKodalamaHomePage.dataAcsess.CategoryDao;

import oopKodalamaHomePage.entities.Category;

public class CategoryManeger {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManeger(CategoryDao categoryDao,  Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {
		if (category.getCategoryName() == category.getCategoryName()) {
			throw new Exception(
					category.getCategoryName() + " " + "Kategori zaten eklenmiş. Kategori ismi tekrar edemez");

		}
		//JdbsCategoryDao categoryDao = new JdbsCategoryDao();
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());

		}
	}
}