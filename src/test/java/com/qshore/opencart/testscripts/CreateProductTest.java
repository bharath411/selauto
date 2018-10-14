package com.qshore.opencart.testscripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qshore.opencart.commons.PropertiesHandler;
import com.qshore.opencart.pages.AdminDashboardPage;
import com.qshore.opencart.pages.AdminLoginPage;
import com.qshore.opencart.pages.AdminProductsAddPage;
import com.qshore.opencart.pages.AdminProductsListPage;

public class CreateProductTest extends BaseTestCase {
	
	public static Logger log = LogManager.getLogger(CreateProductTest.class);
	// @Test
	public void deleteProdcutTest() {

		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("admin", "admin");

		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnProducts();

		AdminProductsListPage adminProductsListPage = new AdminProductsListPage(driver);
		adminProductsListPage.removeProduct();
	}

	// @Test
	public void createProductTest() {
		String productName = excelHandler.getCellData(2, 2);
		String metaTitle = excelHandler.getCellData(2, 3);
		String metaDisc = excelHandler.getCellData(2, 4);
		String expected = "Successfully product created";

		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("admin", "admin");

		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnProducts();

		AdminProductsListPage adminProductsListPage = new AdminProductsListPage(driver);
		adminProductsListPage.clickCreateProductButton();

		AdminProductsAddPage adminProductsAddPage = new AdminProductsAddPage(driver);
		adminProductsAddPage.createProduct(productName, metaTitle, metaDisc);
		String actual = adminProductsAddPage.getMessage();
		
		Assert.assertEquals(actual, expected);
	}

	// @Test
	public void createProductTest2() {
		String productName[] = new String[3];
		String metaTitle[] = new String[3];
		String metaDisc[] = new String[3];

		productName[0] = excelHandler.getCellData(2, 2);
		metaTitle[0] = excelHandler.getCellData(2, 3);
		metaDisc[0] = excelHandler.getCellData(2, 4);

		productName[1] = excelHandler.getCellData(3, 2);
		metaTitle[1] = excelHandler.getCellData(3, 3);
		metaDisc[1] = excelHandler.getCellData(3, 4);

		productName[2] = excelHandler.getCellData(4, 2);
		metaTitle[2] = excelHandler.getCellData(4, 3);
		metaDisc[2] = excelHandler.getCellData(4, 4);

		for (int i = 0; i < 3; i++) {
			System.out.println(productName[i]);
			System.out.println(metaTitle[i]);
			System.out.println(metaDisc[i]);
		}

	}

	@Test(dataProvider = "prodDp")
	public void createProductTest4(String productName, String metaTitle, String metaDisc) {
		log.info("I am in createProductTest4 method");
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		
		PropertiesHandler p = new PropertiesHandler();
		String username = p.getValue("username");
		String password = p.getValue("password");
		log.debug("I am login into application using username -"+ username + " password - " + password);
		adminLoginPage.login(username, password);

		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnProducts();

		AdminProductsListPage adminProductsListPage = new AdminProductsListPage(driver);
		adminProductsListPage.clickCreateProductButton();

		AdminProductsAddPage adminProductsAddPage = new AdminProductsAddPage(driver);
		adminProductsAddPage.createProduct(productName, metaTitle, metaDisc);
		
		String actual = adminProductsAddPage.getMessage();
		String expected = "Successfully product created";
		log.info("Actual Message - " + actual);
		log.info("Expected Message - " + expected);
		log.error("I am error message");
		Assert.assertEquals(actual, expected);

	}

	@DataProvider(name = "prodDp")
	public Object[][] dataHandle() {

		int rows = excelHandler.totalRows();
		Object[][] st = new Object[rows][3];

		for (int i = 0; i < st.length; i++) {
			st[i][0] = excelHandler.getCellData(2 + i, 2);
			st[i][1] = excelHandler.getCellData(2 + i, 3);
			st[i][2] = excelHandler.getCellData(2 + i, 4);
		}
		return st;
	}

}
