package progj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.*;

public class baseTest{
	
WebDriver driver;
	
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void LoginToAPP() {
		login login=new login(driver);
		PageFactory.initElements(driver, login);
		login.EnterTheUserCred();
		login.ClickOnLogin();
		login.VerifyWhetherElementisPresentInHomePage();
		login.closeBrowser();
		
	}
	
}
