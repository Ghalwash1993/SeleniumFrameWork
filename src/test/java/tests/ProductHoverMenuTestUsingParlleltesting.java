package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class ProductHoverMenuTestUsingParlleltesting extends TestBase2
{
	HomePage homeObject ; 

	@Test
	public void UserCanSelectSubCategoryFromMainMenu() 
	{
		homeObject = new HomePage(getDriver()); 
		homeObject.selectNotebooksMenu();
		Assert.assertTrue(((WebDriver) driver).getCurrentUrl().contains("notebooks"));
	}
}
