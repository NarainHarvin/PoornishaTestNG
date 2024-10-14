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

public class LoginStepDefwithData{
	WebDriver driver;
	
    @Given("user will launch the application")
	public void user_will_launch_the_application() {
    	 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
    }
	   
	
    @When("user gives  the valid {string} and {string}")
	public void user_gives_the_valid_and(String username, String password) {
    	
    	
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
    }
    	
    @When("user will click  the login button")
	public void user_will_click_the_login_button() {
    	WebElement java =driver.findElement(By.xpath("//button[text()=' Login ']"));
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", java);
    }
    	
    
	@Then("user  moves to the  homescreen")
	public void user_moves_to_the_homescreen() {
		WebElement homePage = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		boolean verify = homePage.isDisplayed();
		Assert.assertTrue(verify);
		
	}
	   





	


	

}
