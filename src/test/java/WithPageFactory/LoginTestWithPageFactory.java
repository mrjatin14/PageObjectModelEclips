package WithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WithoutPageObjectModel.LoginWithPageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//create obj of loginPage it will take argument of Previous constructor
		LoginPage Loginpg = new LoginPage(driver);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Loginpg.enterUsername("student");
		Loginpg.enterPassword("Password123");
		Loginpg.clickLoginBtn();
		
		
	}

}
