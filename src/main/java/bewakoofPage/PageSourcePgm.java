package bewakoofPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSourcePgm {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/main/div[1]/div/section/div/div[5]/span")
	WebElement Accessories;


public  PageSourcePgm(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	

}
public void AccessoriesPgm() {
	Accessories.click();
}
}
