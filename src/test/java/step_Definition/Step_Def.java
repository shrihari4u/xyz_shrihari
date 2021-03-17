package step_Definition;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.Base;
import common.Validation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.HomePage;


public class Step_Def {
	public WebDriver driver;
	public HomePage hp;
	public ExtentTest test;
	public 	ExtentReports report;
	public static Properties p;
	public String title;
	
@BeforeTest
	@Given("^open facebook$")
		public void open_facebook() throws Throwable {
		FileReader reader=new FileReader("C:\\Users\\bshre\\selenium-eclipse-workspace\\evolutyz\\src\\test\\resources\\properties\\evolutyz.properties");
	    p=new Properties();
        p.load(reader);
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",p.getProperty("Driver"));
		//driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		report = new ExtentReports("C:\\Users\\bshre\\selenium-eclipse-workspace\\evolutyz\\target\\reports"+"\\ExtentReportResults.html",true);
		test=report.startTest("TestName");
//     	report = new ExtentReports(p.getProperty("ExtentReport")+"\\ExtentReportResults.html",true);
//		report = new ExtentReports(p.getProperty("ExtentReport")+"\\ExtentReportResults.html",true);
		test.log(LogStatus.INFO, "Launch the ChromeDdriver ");
		test.log(LogStatus.PASS,"Driver Should be up and running");
//		report.endTest(test);
//    	report.flush();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Base base=new Base(driver);
    	base.takeScreenShot("facebook");
		//driver.get(p.getProperty("URL"));
//    	title=driver.getTitle();
    	test.log(LogStatus.INFO, "Open Facebook ");
    	String title=driver.getTitle();
    	String ExpectedTitle =Validation.m1("OpenFB");
    	String ActualTitle =driver.getTitle();
    	if (title.equalsIgnoreCase(ExpectedTitle))
    	{
    	System.out.println("pass");
    	test.log(LogStatus.PASS,"tittle is coorect");
    	Assert.assertEquals(ExpectedTitle, ActualTitle);
    	}
    	else
    	{
    	System.out.println("fail");
    	test.log(LogStatus.FAIL,"tittle is not coorect");
    	Assert.assertFalse(false);
		
//    	
////		report = new ExtentReports("C:\\Users\\bshre\\selenium-eclipse-workspace\\evolutyz\\target\\reports"+"\\ExtentReportResults.html",true);
//     	report = new ExtentReports(p.getProperty("ExtentReport")+"\\ExtentReportResults.html",true);
//    	test = report.startTest("TestName");
//		test.log(LogStatus.INFO, "Validate facebook login page");
	
	}
    	test.log(LogStatus.INFO, "Validate facebook login page ");
    	String title1=driver.getTitle();
    	String ExpectedTitle1 =Validation.m2("OpenLoginPage");
    	String ActualTitle1 =driver.getTitle();
    	if (title1.equalsIgnoreCase(ExpectedTitle1))
    	{
    	System.out.println("pass");
    	test.log(LogStatus.PASS,"Facebook login page should be displayed sucessfully ");
    	Assert.assertEquals(ExpectedTitle1, ActualTitle1);
    	}
    	else
    	{
    	System.out.println("fail");
    	test.log(LogStatus.FAIL,"Validate facebook login page is not correct");
    	Assert.assertFalse(false);
    	test.log(LogStatus.PASS,"Facebook login page should be displayed sucessfully  ");
    	report.endTest(test);
    	report.flush();
		//return title;
		//return ActualTitle1;
	}
		return;
	}
	
	@Test
	@Then("^enter emailid$")
	public void emailid() throws Throwable{
		hp=new HomePage(driver);
		hp.enterEmailId();
		Thread.sleep(2000);
		Base base=new Base(driver);
		base.takeScreenShot("emailid");
		test.log(LogStatus.INFO, "enter valid emalid");
		String title1=driver.getTitle();
    	String ExpectedTitle2 =Validation.m3("EnterEmailid");
    	String ActualTitle2 =driver.getTitle();
    	if (title1.equalsIgnoreCase(ExpectedTitle2))
    	{
    	System.out.println("pass");
    	test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message");
    	Assert.assertEquals(ExpectedTitle2, ActualTitle2);
    	}
    	else
    	{
    	System.out.println("fail");
    	test.log(LogStatus.FAIL,"should display as invalid emailid");
    	Assert.assertFalse(false);
    	test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message  ");
    	report.endTest(test);
    	report.flush();
    
    	}
//		if(hp.emailid.isDisplayed())
//		{
//		test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message");
//		}
//		else
//		{
//			test.log(LogStatus.FAIL,"should display as invalid emailid");
//	}
//		test.log(LogStatus.INFO, "enter valid emalid");
//		test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message ");
//    	report.endTest(test);
//    	report.flush();
//		
		return;
    	
	}
	
	@Test
	@Then("^enter password$")
	public void enter_password() throws Throwable {
		hp=new HomePage(driver);
		hp.enterPassWord();
		Thread.sleep(2000);
		Base base=new Base(driver);
		base.takeScreenShot("password");
		test.log(LogStatus.INFO, "enter valid password");
		String title1=driver.getTitle();
    	String ExpectedTitle3 =Validation.m4("EnterPassword");
    	String ActualTitle3 =driver.getTitle();
    	if (title1.equalsIgnoreCase(ExpectedTitle3))
    	{
    	System.out.println("pass");
    	test.log(LogStatus.PASS,"entered valid password should be accepted without any error message");
    	Assert.assertEquals(ExpectedTitle3, ActualTitle3);
    	}
    	else
    	{
    	System.out.println("fail");
    	test.log(LogStatus.FAIL,"should display as invalid password");
    	Assert.assertFalse(false);
    	test.log(LogStatus.PASS,"entered valid password should be accepted without any error message  ");
    	report.endTest(test);
    	report.flush();
//    
//		test.log(LogStatus.PASS,"entered valid password should be accepted without any error message  ");
//    	report.endTest(test);
//    	report.flush();
		
    	
	}
		return;
    	
	}
	@AfterTest
@SuppressWarnings("deprecation")
@Then("^click on Login$")
public void click_on_Login() throws Throwable {
	hp=new HomePage(driver);
	hp.clickOnLogIn();
	Thread.sleep(2000);
	Base base=new Base(driver);
	base.takeScreenShot("Login");
	test.log(LogStatus.INFO, "Click On Login Button");
	String title1=driver.getTitle();
	String ExpectedTitle4 =Validation.m5("Submit");
	String ActualTitle4 =driver.getTitle();
	if (title1.equalsIgnoreCase(ExpectedTitle4))
	{
	System.out.println("pass");
	test.log(LogStatus.PASS,"Login should be successful");
	Assert.assertEquals(ExpectedTitle4, ActualTitle4);
	}
	else
	{
	System.out.println("fail");
	test.log(LogStatus.FAIL,"Login should be unsuccessful");
	Assert.assertFalse(false);
	test.log(LogStatus.PASS,"Login should be successful ");
	report.endTest(test);
	report.flush();
	
	}
	
	return;
}
//	if(hp.emailid.isDisplayed())
//	{
//	test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message");
//	}
//	else
//	{
//		test.log(LogStatus.FAIL,"should display as invalid emailid");
//}
//	test.log(LogStatus.INFO, "enter valid emalid");
//	test.log(LogStatus.PASS,"entered valid emailid should be accepted without any error message ");
//	report.endTest(test);
//	report.flush();
//	
	@AfterTest
@ Then ("^search some one$")
public void search_some_one() throws Throwable {
	hp=new HomePage(driver);
	hp.searchSomeone();
	driver.findElement(By.xpath("//*[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']")).click();
	Thread.sleep(10000);
	Base base=new Base(driver);
	base.takeScreenShot("Search");
	test.log(LogStatus.INFO, "enter valid search");
	String title1=driver.getTitle();
	String ExpectedTitle5 =Validation.m6("Searchitem");
	String ActualTitle5 =driver.getTitle();
	if (title1.equalsIgnoreCase(ExpectedTitle5))
	{
	System.out.println("pass");
	test.log(LogStatus.PASS,"Search Should be Successully");
	Assert.assertEquals(ExpectedTitle5, ActualTitle5);
	}
	else
	{
	System.out.println("fail");
	test.log(LogStatus.FAIL,"No Item Found");
	Assert.assertFalse(false);
	test.log(LogStatus.PASS,"Search Should be Successully  ");
	report.endTest(test);
	report.flush();
}
	
//@Then("^click on logout button$")
//public void click_on_logout_button() throws Throwable {
//	Thread.sleep(6000);
//	hp=new HomePage(driver);
//	hp.logOut();
//	Thread.sleep(2000);
//	Base base=new Base(driver);
//	base.takeScreenShot("Logout");	


//	WebElement AccSettings = driver.findElement(By.id("userNavigationLabel"));
//	AccSettings.click();
//	
////	WebDriverWait wait = new WebDriverWait(driver, 8);
////	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
////	logout.click();
////	
//	Actions act =  new Actions(driver);
//	WebElement e= driver.findElement(By.xpath("(//*[@data-visualcompletion='ignore'])[22]"));
//	act.moveToElement(e).build().perform();
//    act.click(e).build().perform();
	


}
}