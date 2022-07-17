package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilityClass;

public class Login_Page 
{

	@FindBy (name = "uid") private WebElement userid;
	@FindBy (name = "password") private WebElement password;
	@FindBy (name = "btnLogin") private WebElement logbtn;
	@FindBy (xpath="/html/body/div[3]/div/ul/li[15]/a") private WebElement Logout;


public Login_Page (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterusrid(int i) throws EncryptedDocumentException, IOException
{
	userid.sendKeys(UtilityClass.logindata(i, 1));
	
}
public void enterpwd(int j) throws EncryptedDocumentException, IOException
{
	password.sendKeys(UtilityClass.logindata(j, 2));
}
public void enteruseid(String usid)	
{
	userid.sendKeys(usid);
}

public void enterpass(String pass)
{
	password.sendKeys(pass);
}
public void login()
{
	logbtn.click();
}

public void out()
{
	Logout.click();
}

}