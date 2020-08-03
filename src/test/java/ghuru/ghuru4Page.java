package ghuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ghuru4Page {
	WebDriver drvier ; 
	public ghuru4Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"header\"]/div/div[2]/div/a/span[2]")
	WebElement AccountBtn;

	@FindBy(xpath="//*[@id=\"header-account\"]/div/ul/li[1]/a")
	WebElement MyaccountBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement MyOrdersBtn;

	@FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[1]")
	WebElement ViewOrderBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
	WebElement PrintOrderBtn;

	public void PrintPdf() throws InterruptedException
	{
		Thread.sleep(2000);
		AccountBtn.click();
		MyaccountBtn.click();
		MyOrdersBtn.click();
		ViewOrderBtn.click();
		PrintOrderBtn.click();


	}

}
