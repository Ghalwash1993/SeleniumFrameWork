package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase
{
	HomePage home;
	ContactUsPage contactPage;

	String email = "test@test.com";
	String fullName = "Test User";
	String enquiry = "Hello Admin , this is for test";

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Contact Us Test Case")
	@Link(url = "https://google.com")
	public void UserCanUseContactUs() {
		home = new HomePage(driver);
		home.openContactUsPage();
		contactPage = new ContactUsPage(driver);
		contactPage.ContactUs(fullName, email, enquiry);
		 Assert.assertTrue(contactPage.successMessage.getText()
				 .contains("Your enquiry has been successfully sent to the store owner."));
	}

}
