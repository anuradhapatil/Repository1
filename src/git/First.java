package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class First {
@Test
public void first(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gooogle.com");
	Assert.assertEquals("Google",driver.getTitle());
	System.out.println("Title verified");
}
}
