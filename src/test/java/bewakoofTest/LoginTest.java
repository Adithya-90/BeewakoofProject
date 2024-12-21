package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bewakoofPage.LoginPage;

public class LoginTest extends BaseClass {
@Test
public void LogPgm() {
	LoginPage ob=new LoginPage (driver);
	ob.LoginPgm();
	ob.GoogleSgPgm();
	ob.MailPgm();
	ob.NextPgm();


	
}
}
