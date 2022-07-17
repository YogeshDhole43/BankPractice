package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass 

{
	protected WebDriver driver;
@BeforeClass
public void browser_launch() 
{
	String key = "webdriver.gecko.driver";
	String value = "./driver/geckodriver-v0.31.0-win64/geckodriver.exe";
	System.setProperty(key, value);
	String url = "https://www.demo.guru99.com/V4/";
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(url);

	
}

@AfterClass
public void browser_close()
{
	driver.quit();
}
}
