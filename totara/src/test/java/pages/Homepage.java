package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	Homepage page;
	WebDriver driver;
@FindBy(xpath="//div[@class='logo logo--primary']") WebElement logo;

public Homepage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public Homepage clickImage() {
	logo.click();
	
	return this ;
	
}

}
