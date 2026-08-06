package STEPDEFINATION;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class XPATH  {
	WebDriver driver;
	@Then("user open another page")
		public void useropenanotherpage() throws InterruptedException{
		driver =LOGINSTEP.driver;
	    driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);  }
	
	@And("user entrees firstname {string}")
	public void Username(String fname)  throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(fname);
    }
	@And("user entrees lastname {string}")
	public void password(String lname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(lname);
    }
	
	@Then("Close browser")
	public void Closebrowser() {
		LOGINSTEP.driver.quit();}	
	
	
}
