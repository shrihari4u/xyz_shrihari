package pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	public static Properties p;
	
	
	@FindBy (xpath="//input[@id='email']")
	public WebElement emailid;
	
	@FindBy (xpath="//input[@id='pass']")
	public WebElement enterpassword;
	
	@FindBy (xpath="//*[@name='login']")
	public WebElement clickonlogin;
	
	@FindBy (xpath="//input[@type='search']")
	public WebElement search;
	

//	@FindBy (xpath="//*[@class='class='hu5pjgll lzf7d6o1 sp_cscDXLZXIQS sx_a07fe7']")
//	public WebElement logout;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}

	
	public void enterEmailId() throws IOException
	{ 
		FileReader reader=new FileReader("C:\\Users\\bshre\\selenium-eclipse-workspace\\evolutyz\\src\\test\\resources\\properties\\evolutyz.properties");
	    p=new Properties();
        p.load(reader);
        
		emailid.sendKeys(p.getProperty("Email"));
	}

	
	public void enterPassWord()
	{
		enterpassword.sendKeys("santoshi12");
	}

	
	public void clickOnLogIn() {
		clickonlogin.click();
	}
	
	public void searchSomeone()
	{
		search.sendKeys("Dr.Sharanabasava Hiremath");
		
	}

//	public void logOut()
//	{
//		logout.click();
//	
//		WebElement signOut = driver.findElement(By.linkText("LogOut"));
//		signOut.click();
	}



