package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import InterfacePages.loginpage;

public class login implements loginpage{
	
	WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="txtUsername")
	public WebElement Username;
	
	@FindBy(id="txtPassword")
	public WebElement Password;
	
	@FindBy(id="btnLogin")
	public WebElement Loginbutton;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public WebElement recmodver;
	
	@FindBy(xpath="//a[@id='welcome']")
	public WebElement Welcomebutton;
	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement Logoutbut;
	
	public void EnterTheUserCred() {
		System.out.println("In EnterTheUserCred");
		Username.sendKeys("Admin");
		Password.sendKeys("admin123");
	}
	
	public void ClickOnLogin() {
		System.out.println("In ClickOnLogin");
		Loginbutton.click();
	}
	
	public void VerifyWhetherElementisPresentInHomePage() {
		System.out.println("In VerifyWhetherElementisPresentInHomePage");
		if(recmodver.isDisplayed()) {
			System.out.println("Element recmodver is displayed");
		}
	}
	
	public void closeBrowser() {
		Welcomebutton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Logoutbut.click();
	}
}
