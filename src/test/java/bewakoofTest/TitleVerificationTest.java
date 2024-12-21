package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.TitleVerification;

public class TitleVerificationTest extends BaseClass{
@Test
public void TitPgm() {
	TitleVerification ok=new TitleVerification(driver);
	ok.titleverification();
	
	
	
}
}
