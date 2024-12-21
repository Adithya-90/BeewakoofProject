package bewakoofPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screenshot {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"pb0-0\"]/div/div")
	WebElement PageScreen;
	@FindBy(xpath="//*[@id=\"__next\"]/main/main/header/div/div[2]/div[2]/ul/a[1]/span")
	WebElement ElementScreen;
	
	public  Screenshot(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public void Screenpgm() throws IOException 
	{
	File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                 ///page Screenshot
	FileHandler.copy(c, new File("C:\\Users\\USER\\Pictures\\Camera Roll.png"));

	WebElement button=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/header/div/div[2]/div[2]/ul/a[1]/span"));                               ///element Screenshot
	File buttonImage=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(buttonImage, new File(""));
	}
	public void PageScreenPgm() {
		PageScreen.getScreenshotAs(OutputType.FILE);
	}
	public void ElementScreenpgm() {
		ElementScreen.getScreenshotAs(OutputType.FILE);
	}
}



