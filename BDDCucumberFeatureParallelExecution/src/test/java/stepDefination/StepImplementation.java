package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepImplementation {

	 WebDriver driver;

	@Given("^I load the \"(.*)\"$")
	public void loadUrl(String url) {
		WebDriverManager.chromedriver().setup();
  if(driver==null) {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
}

		driver.get(url);

	}

	@Then("^I enter username and password into the respective fields$")
	public void enterUsernameAndPassword(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		for (int i = 1; i < data.size(); i++) {
			for (int j = 0; j < data.get(i).size(); j++) {

				String value = data.get(i).get(j);

				if (j == 0) {

					WebElement user = driver.findElement(By.id("txtUsername"));
					user.clear();
					user.sendKeys(value);

				}
				
				if(j==1) {
					WebElement pass = driver.findElement(By.id("txtPassword"));
					pass.clear();
					pass.sendKeys(value);
				}

			}
		}
		
			
		}
	@Then("^I click the element \"(.*)\"$")
	public void clickButton(String element1) {
		driver.findElement(By.xpath(element1)).click();
		
			
		}
	@Then("^I click element \"(.*)\"$")
	public void clickTimeSheet(String element2) {
		driver.findElement(By.xpath(element2)).click();
	}
	
	@Then("^I enter \"(.+)\" into element \"(.*)\"$")
	public void enterText(String text,String element3) {
	WebElement input =	driver.findElement(By.id(element3));
	
	input.clear();
	input.sendKeys(text);
	}
	
	@And("^I clk element \"(.*)\"$")
	public void clickElement(String element4) {
		
		driver.findElement(By.xpath(element4)).click();
	}
	

	}


