package bewakoofPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
@FindBy(xpath="//*[@id=\"__next\"]/main/main/header/div/div[2]/div[2]/ul/a[1]/span")
WebElement Login;
@FindBy(xpath="//*[@id=\"__next\"]/main/main/div/section/div[2]/div[2]/form/div/div[4]/button[1]")
WebElement GoogleSg ;
@FindBy(xpath="//*[@id=\"identifierId\"]")
WebElement Mail ;
@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
WebElement Next ;


public LoginPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void LoginPgm() {
	Login.click();
}
public void GoogleSgPgm() {
	GoogleSg.click();
}
public void MailPgm() {
	Mail.sendKeys("adithya904847@gmail.com");

}
public void NextPgm() {
	Next.click();
}
}

