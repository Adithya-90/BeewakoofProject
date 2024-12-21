package bewakoofPage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public  class TitleVerification {
	WebDriver driver;
	
	public TitleVerification(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void titleverification() {
		
		String ActualTitle=driver.getTitle();
		String exp="Bewakoof";
		if(exp.equals(ActualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
		
}