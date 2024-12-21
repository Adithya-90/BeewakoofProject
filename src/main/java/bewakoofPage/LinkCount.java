package bewakoofPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkCount {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"__next\"]/main/main/header/div/div[2]/div[1]/a")
	WebElement linkCount;
	
	public LinkCount(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void LinkCuntPgm() {
		List<WebElement>linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no:of link="+ linkDetails.size());
	
		for(WebElement element:linkDetails)
		{
			String link=element.getAttribute("abcd");
			verify(link);
		}
	}
	private void verify(String link) {
		// TODO Auto-generated method stub
		try {
			URL u=new URL(link);
			HttpURLConnection code=(HttpURLConnection )u.openConnection();
			if(code.getResponseCode()==200)
			{
				System.out.println("Response code is 200---------"+link);
			}
			else if(code.getResponseCode()==404)
			{
				System.out.println("Response code is 404----------"+link);
			}
			else
			{
				System.out.println("Other response code");
			}
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		linkCount.getText();
	}

}
