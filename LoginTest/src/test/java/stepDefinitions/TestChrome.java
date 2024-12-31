package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestChrome {
	
	WebDriver driver = null;

	@BeforeTest
	public void StartPage() {
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void SearchGoogle() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Learn Testing");
		System.out.println("Page Title: " + driver.getTitle());
		
	}
	
	@AfterTest
	public void ClosePage() {
		driver.close();
		driver.quit();
		
	}

}
