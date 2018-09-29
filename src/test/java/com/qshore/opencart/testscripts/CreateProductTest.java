package com.qshore.opencart.testscripts;

import org.testng.annotations.Test;

import com.qshore.opencart.pages.AdminDashboardPage;
import com.qshore.opencart.pages.AdminLoginPage;
import com.qshore.opencart.pages.AdminProductsListPage;

public class CreateProductTest extends BaseTestCase{
	
	

	@Test
	public void test1() {
	
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("admin", "admin");
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnProducts();
		
		AdminProductsListPage adminProductsListPage = new AdminProductsListPage(driver);
		adminProductsListPage.clickCreateProductButton();
	}
}
