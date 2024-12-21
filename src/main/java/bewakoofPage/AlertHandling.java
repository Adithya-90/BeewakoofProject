package bewakoofPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AlertHandling {
WebDriver driver;
@FindBy(xpath="//*[@id=\"__next\"]/main/main/div[1]/div/section/div/div[7]/span")
WebElement HeavyDuty;
@FindBy(xpath="//*[@id=\"__next\"]/main/main/div[2]/div/main/div/section[2]/section/section[1]/a/figure/img")
WebElement First;
@FindBy(xpath="//*[@id=\"wzrk-cancel\"]")
WebElement popup;

public  AlertHandling (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void HeavyDutyPgm() {
	HeavyDuty.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
public void popUp() {
	popup.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
public void FirstPgm() {
	First.click();
}
}
