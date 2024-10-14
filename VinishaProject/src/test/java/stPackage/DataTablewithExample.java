package stPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithExample {
	WebDriver driver;
	
	@Given("Proceed to login page")
	public void proceed_to_login_page() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
	    
	}


	
	@When("user enters  {string} and {string}")
	public void user_enters_and(String username, String password) {
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		    
	
	}
	    
	@When("clicked  button")
	public void clicked_button() {
WebElement java =driver.findElement(By.xpath("//button[text()=' Login ']"));
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", java);
	   
	    
	}




}
