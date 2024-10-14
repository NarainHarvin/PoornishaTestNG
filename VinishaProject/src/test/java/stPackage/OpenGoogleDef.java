package stPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OpenGoogleDef {
	WebDriver driver;
	
	@Given("Customer opens  login page")
	public void customer_opens_login_page() {
		
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 
		 driver.manage().window().maximize();
	    
	}

	@When("Customer enters  the below credentials")
	public void customer_enters_the_below_credentials() {
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Encyclopedia");
	    
	}

//	@When("Customer clicks login button")
//	public void customer_clicks_login_button() {
//	    
//	}

}
