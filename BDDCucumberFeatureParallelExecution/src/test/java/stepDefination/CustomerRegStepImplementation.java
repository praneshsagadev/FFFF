package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerRegStepImplementation {
	
	WebDriver driver;
	
	@Given("^I load the Url \"(.+)\"$")
	public void loadTheUrl(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get(url);
	}
	@Then("^I enter name (.*)$")
	public void enterName(String name) {
		driver.findElement(By.name("cname")).sendKeys(name);
	}
	@And("^I enter age (.*)$")
	public void enterAge(String age) {
		
		driver.findElement(By.name("age")).sendKeys(age);
	}
	@And("^I enter address (.*)$")
	public void enterAddress(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}
	@And("^I enter number (.*)$")
	public void enterNumber(String number) {
		driver.findElement(By.name("phonenumber")).sendKeys(number);
		
	}
	@And("^I enter email (.*)$")
	public void enterEmail(String email) {
		driver.findElement(By.name("email")).sendKeys(email);
		
	}
	@Then("^I click submit button$")
	public void clickButton() {
		driver.findElement(By.id("submit")).click();
	}
	
	

}
