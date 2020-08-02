import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ghuru3Page {
	WebDriver drvier ; 
	Faker fakeData = new Faker(); 
	String email= fakeData.internet().emailAddress();
	public ghuru3Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"wishlist-view-form\"]/div/div/button[2]/span/span")
	WebElement AddtoCartBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button/span/span")
	WebElement ProccedToCHeckoutBtn;

	@FindBy(id="billing:street1")
	WebElement billingstreet1;

	@FindBy(id="billing:city")
	WebElement billingcity;

	@FindBy(id="billing:region_id")
	WebElement stateoptionlist;

	@FindBy(id="billing:postcode")
	WebElement zipTxt;

	@FindBy(id="billing:telephone")
	WebElement mobileTxt;

	@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button")
	WebElement continue1;

	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button/span/span")
	WebElement continue2;

	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/form/div/dl/dt[2]/input")
	WebElement cashcheckbox;

	@FindBy(xpath="//*[@id=\"payment-buttons-container\"]/button/span/span")
	WebElement conyiune3;

	@FindBy(xpath="//*[@id=\"review-buttons-container\"]/button/span/span")
	WebElement placeorderBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a")
	WebElement ordernumber;
	
	public void Purchase() throws InterruptedException
	{
		
		AddtoCartBtn.click();
		ProccedToCHeckoutBtn.click();
		billingstreet1.sendKeys("44,Mortada street,Alexandria");
		billingcity.sendKeys("Alexandria");
		Select select = new Select(stateoptionlist);
		select.selectByVisibleText("Alabama");
		zipTxt.sendKeys("25000");
		mobileTxt.sendKeys("01000412746");
		JavascriptExecutor js =(JavascriptExecutor) Testghuru.driver;
		js.executeScript("scrollBy(0,500)");
		continue1.click();
		js.executeScript("scrollBy(0,-700)");
		Thread.sleep(2000);
		continue2.click();
		Thread.sleep(2000);

		cashcheckbox.click();
		Thread.sleep(2000);
		conyiune3.click();
		js.executeScript("scrollBy(0,3000)");
		Thread.sleep(6000);

		placeorderBtn.click();

		String ordernumber1=ordernumber.getText();
		System.out.println(ordernumber1);
	}
}
