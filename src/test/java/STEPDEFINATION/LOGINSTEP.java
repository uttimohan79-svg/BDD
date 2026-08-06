package STEPDEFINATION;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LOGINSTEP {
	public static  WebDriver driver;
	
	
	@Given("User launches HYRtutorials")
	public void user_launches() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");;
    }
	@When("User enters username {string}")
	public void Username(String Username)  throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name=\"fname\"]")).sendKeys(Username);
		
    }
	@And("User enters password {string}")
	public void password(String password) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(password);
	
    }
	
	
	

}
