package common;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	public WebDriver driver;
	public Base(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void takeScreenShot(String p1) throws Exception
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\bshre\\selenium-eclipse-workspace\\evolutyz\\target\\"+p1+".png");
		FileUtils.copyFile(scr, dest);
	}

}
