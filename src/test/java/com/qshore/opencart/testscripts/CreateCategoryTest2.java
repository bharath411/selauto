package com.qshore.opencart.testscripts;


import org.testng.annotations.Test;

import com.qshore.opencart.commons.PropertiesHandler;
import com.qshore.opencart.pages.AdminCategoriesAddPage;
import com.qshore.opencart.pages.AdminCategoriesListPage;
import com.qshore.opencart.pages.AdminDashboardPage;
import com.qshore.opencart.pages.AdminLoginPage;

public class CreateCategoryTest2 extends BaseTestCase{

	
	@Test
	public void testCreateCat() {

		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		AdminCategoriesListPage adminCategoriesListPage = new AdminCategoriesListPage(driver);
		AdminCategoriesAddPage adminCategoriesAddPage = new AdminCategoriesAddPage(driver);
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		PropertiesHandler p = new PropertiesHandler();
		String username = p.getValue("username");
		String password = p.getValue("password");
		adminLoginPage.login(username, password);
		adminDashboardPage.clickOnItem("Categories");
		adminCategoriesListPage.clickCreateCatButton();
		adminCategoriesAddPage.addCategory();
	}
}
