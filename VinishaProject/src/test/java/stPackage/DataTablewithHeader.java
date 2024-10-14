package stPackage;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithHeader {
	
	WebDriver driver;
	
	@Given("go to  login page")
	public void go_to_login_page() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 
	    
	}


	

	@When("user enters  the below credentials")
	public void user_enters_the_below_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		
		List<Map<String, String>> Keyvaluepair = dataTable.asMaps(String.class, String.class);
		
		//dataTable.asList)
	
		String username = Keyvaluepair.get(0).get("userName");
		String password = Keyvaluepair.get(0).get("passWord");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
		
	    
	}
	@When("Enter login button")
	public void enter_login_button() {
        WebElement java =driver.findElement(By.xpath("//button[text()=' Login ']"));
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", java);
	   
	    
	}




}
