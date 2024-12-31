package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch_sd {

	WebDriver driver = null;
	
	@Test
	@Given("browser window is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step: The browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
	}
	@Test
	@And("user is on google search page")
	public void user_is_on_Google_Search_Page() {
		
		System.out.println("Inside Step: The user is on Google search page");
		
		driver.get("https://google.com");
		
	}
	@Test
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		
		System.out.println("Inside Step: user enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		Thread.sleep(2000);
	}
	@Test
	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		System.out.println("Inside Step: hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		System.out.println("Inside Step: The user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
		
	}
}
