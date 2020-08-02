package ghuru;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import data.ExcelReader2;
import utilities.Helper;

public class ghuru99 extends Testghuru {
	
	
	@DataProvider(name="ExcelDataghuru")
	public Object[][] userloginghuru() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}

	@Test(priority=1,dataProvider="ExcelDataghuru")
	public void inputusernameandpassword(String username,String password) throws IOException, InterruptedException
	{

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);



		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")));
		WebElement userTxt= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userTxt.sendKeys(username);
		WebElement passTxt=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		passTxt.sendKeys(password);
		WebElement loginBtn=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		loginBtn.click();

		WebElement outputresult = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
		String ooutputresultTxt=outputresult.getText();
		Assert.assertEquals(outputresult.getText().contains(ooutputresultTxt), true);
		Helper.captureScreenshot(driver,"homepageScreenshot");
		

		WebElement logoutBtn=driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a"));
		logoutBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();


	}
	@DataProvider(name="ExcelDataghuruinvalid")
	public Object[][] userloginghuruinvalid() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader2 ER = new ExcelReader2();
		return ER.getExcelData();
	}

	@Test(priority=2,dataProvider="ExcelDataghuruinvalid")
	public void inputInvalidusernameandpassword(String username,String password) throws IOException, InterruptedException
	{

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")));
		WebElement userTxt= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userTxt.sendKeys(username);
		WebElement passTxt=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		passTxt.sendKeys(password);
		WebElement loginBtn=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		loginBtn.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();

	}

	
	
}


