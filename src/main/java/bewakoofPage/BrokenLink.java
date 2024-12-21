package bewakoofPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BrokenLink {
WebDriver driver;

	public void BrokenPgm() {
		List<WebElement>linkDetails=driver.findElements(By.tagName("a"));
		for(WebElement links:linkDetails)
		{
			String link=links.getAttribute("href");
			verify(link);
		}
	}
	private void verify(String link) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("deprecation")
			URL u=new URL(link);
			HttpURLConnection httpURL=(HttpURLConnection )u.openConnection();
			int code=httpURL.getResponseCode();
			if(code==404)
			{
				System.out.println("Broken links="+link);
			}
			
		}
			catch(Exception e)
			{
			
			}
		}
	public  BrokenLink (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	}

