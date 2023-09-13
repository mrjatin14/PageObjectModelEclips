package WithPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//using With Page Factory
//obj repository page
//Benifits of POM- some time automation scripting time web elements property is change due to some time 
//some time we will use web element multiple time so isme one time var ki value krdo that sit bar bar web element ki property ko change  krne ki need nhi padegi
//tohh isee code maintain karne me easy hota h and code reusable hota h, and neat ho jata h clearity aa jaati h it is big advantages & 
//code size much reduces from this approach
public class LoginPage {

	WebDriver driver;
	//created constructor
	LoginPage(WebDriver d)
	{
		driver= d;
		//mandatory
		//we will call page factory's in it method
		//& this method will create web elements
		PageFactory.initElements(driver, this);
	}

	//identify web elements
	@FindBy(id="username")
	WebElement username;


	@FindBy(id="password")
	WebElement password;

	@FindBy(id="submit")
	WebElement submitBtn;

	public void enterUsername(String uname)
	{
		username.sendKeys(uname);;
	}

	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);;
	}

	public void clickLoginBtn()
	{
		submitBtn.click();
	}



}
