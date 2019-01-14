package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMavenJenkins {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testMavenJenkins(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		for (int i = 0; i < 20; i++) {
			driver.findElement(By.id("username")).sendKeys("Admin");
			driver.findElement(By.id("username")).clear();
		}
		Reporter.log("Admin entered in the username text field.. PASS",true);
		
		driver.close();
		Reporter.log("Webpage closed. PASS",true);
		
	}
}
