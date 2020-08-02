package ghuru;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ghuru2Page {
	WebDriver drvier ; 
	Faker fakeData = new Faker(); 

	String email= fakeData.internet().emailAddress();
	public ghuru2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div/h2")
	WebElement homepageTitle;

	@FindBy(css="a.level0")
	WebElement mobileBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1")
	WebElement mobilepageTitle;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	WebElement mobilelist;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul")
	WebElement products_Webelement;

	@FindBy(xpath="//*[@id=\"product-price-1\"]/span")
	WebElement mobileprice;

	@FindBy(id="product-collection-image-1")
	WebElement SonyXbieriaBtn;

	@FindBy(xpath="//*[@id=\"product-price-1\"]/span")
	WebElement mobiledetailprice;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")
	WebElement addtocartBtn;

	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")
	WebElement amountTxt;

	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")
	WebElement UpdateBtn;

	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")
	WebElement ErrorMassege;

	@FindBy(xpath="//*[@id=\"empty_cart_button\"]/span/span")
	WebElement EmptycartBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[2]/p[1]")
	WebElement emptymassage;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	WebElement AddtocompareXberia;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
	WebElement AddtocompareIphone;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span")
	WebElement CompareBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div[1]/h1")
	WebElement popUpMassage;

	@FindBy(xpath="//*[@id=\"header\"]/div/div[2]/div/a/span[2]")
	WebElement AccountBtn;

	@FindBy(xpath="//*[@id=\"header-account\"]/div/ul/li[5]/a")
	WebElement RegisterBtn;

	@FindBy(id="firstname")
	WebElement firstnameTxt;

	@FindBy(id="lastname")
	WebElement lastnameTxt;

	@FindBy(id="email_address")
	WebElement email_addressTxt;


	@FindBy(id="password")
	WebElement passwordTxt;

	@FindBy(id="confirmation")
	WebElement confirmationTxt;

	@FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button")
	WebElement RegisterfinalBtn;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")
	WebElement welcomeMsg;

	@FindBy(xpath="//*[@id=\"nav\"]/ol/li[2]/a")
	WebElement TvBtn;


	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
	WebElement TvaddtoWish;

	@FindBy(xpath="//*[@id=\"wishlist-view-form\"]/div/div/button[1]/span/span")
	WebElement addtowishlist;

	@FindBy(xpath="//*[@id=\"email_address\"]")
	WebElement sharedemails;

	@FindBy(xpath="//*[@id=\"message\"]")
	WebElement sharedmassages;

	@FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button/span/span")
	WebElement finalsharewishlist;

	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")
	WebElement resultsharedMsg;

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
	public void test2()
	{
		Assert.assertTrue(homepageTitle.getText().contains("THIS IS DEMO SITE FOR  "));
		mobileBtn.click();
		Assert.assertEquals(mobilepageTitle.getText(), "MOBILE");
		Select select = new Select(mobilelist);
		select.selectByVisibleText("Name");
		String mobprice=mobileprice.getText();
		System.out.println(mobprice);
		SonyXbieriaBtn.click();
		String mobdetailprice=mobiledetailprice.getText();
		System.out.println(mobdetailprice);
		Assert.assertEquals(mobprice, mobdetailprice);


	}

	public void ErrorVerfication()
	{
		mobileBtn.click();
		addtocartBtn.click();
		amountTxt.clear();
		amountTxt.sendKeys("1000");
		UpdateBtn.click();
		Assert.assertEquals(ErrorMassege.getText().contains("The maximum quantity allowed for purchase is 500"),true);
		EmptycartBtn.click();
		Assert.assertEquals(emptymassage.getText().contains("You have no items in your shopping cart."),true);



	}

	public void VerfiyPopupPage()
	{
		mobileBtn.click();
		AddtocompareXberia.click();
		AddtocompareIphone.click();
		CompareBtn.click();

		String parentWindowHandler = Testghuru.driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = Testghuru.driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			subWindowHandler = iterator.next();
		}
		Testghuru.driver.switchTo().window(subWindowHandler); // switch to popup window

		Assert.assertEquals(popUpMassage.getText().contains("COMPARE PRODUCTS"), true);
		// Now you are in the popup window, perform necessary actions here

		Testghuru.driver.close();

		Testghuru.driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	}

	public void Register() throws InterruptedException
	{
		AccountBtn.click();
		RegisterBtn.click();
		firstnameTxt.sendKeys("ahmed");
		lastnameTxt.sendKeys("ghalwash");
		email_addressTxt.sendKeys(email);
		passwordTxt.sendKeys("C123456789@a");
		confirmationTxt.sendKeys("C123456789@a");
		RegisterfinalBtn.click();
		Assert.assertEquals(welcomeMsg.getText().contains("Thank you for registering with Main Website Store."), true);
		TvBtn.click();
		TvaddtoWish.click();
		//addtowishlist.click();
		//sharedemails.sendKeys("Ahmedgghalwash@gmail.com");
		//sharedmassages.sendKeys("this is a good item for you");
		//finalsharewishlist.click();
		//Assert.assertEquals(resultsharedMsg.getText().contains("Your Wishlist has been shared."), true);

		











	}

}
