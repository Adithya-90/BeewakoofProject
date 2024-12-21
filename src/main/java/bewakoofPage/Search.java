package bewakoofPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
WebDriver driver;
@FindBy(xpath="//*[@id=\"__next\"]/main/main/header/div/div[2]/div[2]/ul/li/div/div/div/div/form/li/input")
WebElement SearchArea;

public Search(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

}
public void SearchPgm() {
	SearchArea.sendKeys("Bag");
}
}