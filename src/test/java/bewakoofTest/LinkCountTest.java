package bewakoofTest;


import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.LinkCount;


public class LinkCountTest extends BaseClass{
	@Test
	public void ResponePg() {
		LinkCount ol=new LinkCount(driver);
		ol.LinkCuntPgm();
	}
}
		

