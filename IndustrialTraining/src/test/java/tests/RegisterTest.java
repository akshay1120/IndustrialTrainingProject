package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.pages.RegisterPage;
import com.demo.testBase.TestBase;


public class RegisterTest extends TestBase
{
	WebDriver driver;
	RegisterPage rp = null ;
	
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		driver = initialization();
		rp = new RegisterPage(driver);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyRadioButtonOfRegisterPage() throws Exception
	{
		log.info("verifying the Radio Button Of Register Page");
		Assert.assertTrue(rp.verifyRadioButton());
	}
	
	@Test (priority=2)
	public void verifySingleCheckBoxOfRegisterPage() throws Exception
	{
		log.info("verifying the Single Check Box Of Register Page");
		Assert.assertTrue(rp.verifySingleCheckBox());
	}
	
	@Test (priority=3)
	public void verifyMultipleCheckBoxOfRegisterPage() throws Exception
	{
		log.info("verifying the Multiple Check Box Of Register Page");
		Assert.assertTrue(rp.verifyMultipleCheckBox());
	}
	
	@Test (priority=4)
	public void verifySelCountryOfRegisterPage() throws Exception
	{
		log.info("verifying Select Country option Of Register Page");
		Assert.assertTrue(rp.verifySelCountry());
	}
	
	@Test (priority=5)
	public void verifyLanguagesOfRegisterPage() throws Exception
	{
		log.info("verifying Languages option Of Register Page");
		Assert.assertTrue(rp.verifyLanguages());
	}
	
	@Test (priority=6)
	public void verifyLanguagesGivenOfRegisterPage() throws Exception
	{
		log.info("verifying Languages option Of Register Page");
		Assert.assertTrue(rp.languageList());
	}
	
	@Test (priority=7)
	public void verifySelectCountry() throws Exception
	{
		log.info("verifying Select Country option Of Register Page");
		Assert.assertTrue(rp.verifySelectCountry());
	}
	
	@Test (priority=8)
	public void verifyGetAllSelectCountryOptions() throws Exception
	{
		log.info("verifying Get All Select Country Options Of Register Page");
		Assert.assertTrue(rp.getAllSelectCountryOptions());
	}
	
	@Test (priority=9)
	public void verifyCountryOption() throws Exception
	{
		log.info("verifying Country Option Of Register Page");
		Assert.assertTrue(rp.verifyCountry());
	}
	
	@Test (priority=10)
	public void verifyGetAllCountryOptions() throws Exception
	{
		log.info("verifying get All Country Options Of Register Page");
		Assert.assertTrue(rp.getAllCountryOptions());
	}
}
