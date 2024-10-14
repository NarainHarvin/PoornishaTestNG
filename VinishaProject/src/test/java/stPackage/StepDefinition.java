package stPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("user launch the application")
	public void user_launch_the_application() throws InterruptedException {
		
		
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		
	   
	}

	@When("user provides valid username and password")
	public void user_provides_valid_username_and_password() {
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		
		WebElement java =driver.findElement(By.xpath("//button[text()=' Login ']"));
		Thread.sleep(5000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", java);
	}

	@Then("user validate the homescreen")
	public void user_validate_the_homescreen() {
		
		//WebElement homePage = driver.findElement(By.xpath("//p[text()='manda user']"));
		WebElement homePage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		boolean verify = homePage.isDisplayed();
		Assert.assertTrue(verify);
	}



}
