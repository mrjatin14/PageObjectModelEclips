package WithoutPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPOM2 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//create obj of loginPage it will take argument of Previous constructor
		LoginWithPageFactory Loginpg = new LoginWithPageFactory(driver);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Loginpg.enterUsername("student");
		Loginpg.enterPassword("Password123");
		Loginpg.clickLoginBtn();
		
		
	}

}
