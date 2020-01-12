package gluecodesSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;

public class Steps {
	Homepage home;
	WebDriver driver;
	@Given("^browser should be launched$")
	public void browser_should_be_launched() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.totaralearning.com/");
	    driver.manage().window().maximize();
	}

	@When("^click logo$")
	public void click_logo() throws Throwable {
	    home = new Homepage(driver);
	    home.clickImage();
	    
	}

	@Then("^verify home page title$")
	public void verify_home_page_title() throws Throwable {
	    String expected= "Totara Learning - Freedom to Learn";
	    
	    String actual = driver.getTitle();
	    
	    if(expected.equalsIgnoreCase(actual)) {
	    	System.out.println("Pass: " +actual);
	    }else {
	    	System.out.println("Fail: "+actual);
	    }
	    
	    driver.quit();
	}

}
