package stPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithoutHeaderDef {
	WebDriver driver;
	
	@Given("user is on the login application")
	public void user_is_on_the_login_application() {
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
	    
	}

    @When("user enters  the valid credentials")
	public void user_enters_the_valid_credentials(DataTable dataTable) {
    	
    	List<String> credentials = dataTable.asList(String.class);
    	String username = credentials.get(0);
    	String password = credentials.get(1);
    	
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}
	
	@When("clicks  the login button")
	public void clicks_the_login_button() {
		
        WebElement java =driver.findElement(By.xpath("//button[text()=' Login ']"));
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", java);
	   
	



	}
}
