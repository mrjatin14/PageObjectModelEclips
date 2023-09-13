package WithoutPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//without Page Factory
public class LoginWithPageFactory {
	//this is page object repository 
	WebDriver driver;
	
	//constructor spcl type method 
	
	LoginWithPageFactory(WebDriver d)
	{
		//ininstialize web driver obj
		driver = d;
		
	}
	
	
	//create methods of operation to be performed on web elements
	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("submit");
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);;
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);;
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	

}
