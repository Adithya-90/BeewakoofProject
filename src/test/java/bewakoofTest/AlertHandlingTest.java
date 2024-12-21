package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.AlertHandling;


public class AlertHandlingTest extends BaseClass {
	@Test
	public void AlertPgm() {
		
		AlertHandling ov=new AlertHandling (driver);
		ov.HeavyDutyPgm();
		ov.popUp();
		ov.FirstPgm();
}
}