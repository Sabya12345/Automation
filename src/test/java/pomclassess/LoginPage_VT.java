package pomclassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_VT 
{
	//declaration
	@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement loginbtn;
	
	//initialization, constructor
	public LoginPage_VT(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	//implementation
	//right click here,source,generate getter setter,only getters//using encapsulation
	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//business library//methods for login operation
	public void loginTOApp(String un,String pwd)
	{
		untxt.sendKeys("admin");
		pwdtxt.sendKeys("admin");
		loginbtn.click();
	}
}
