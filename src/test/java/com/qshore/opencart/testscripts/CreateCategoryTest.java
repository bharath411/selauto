package com.qshore.opencart.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qshore.opencart.commons.CustomListener;


public class CreateCategoryTest extends BaseTestCase{

	
	
	@Test(enabled=false)
	public void testCreateCat() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector(".btn-prim")).click();
		
		
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		driver.findElement(By.cssSelector("#input-name1")).sendKeys("cat2");
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys("cat2 meta");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		//
		
		
		Assert.assertEquals("", "");
		Assert.assertNotEquals("", "");
		MNT mnt =null;
		Assert.assertNull(mnt);
		Assert.assertNotNull(mnt);
		
		Assert.fail();
		
		Assert.assertSame("", "");
		Assert.assertTrue(true);
		Assert.assertFalse(true);
		
	}
}
