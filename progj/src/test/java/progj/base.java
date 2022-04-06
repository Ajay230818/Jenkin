package progj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class base extends baseTest{
	
	@Test
	public void test() {	
		OpenBrowser();
		LoginToAPP();
	}
	
}
