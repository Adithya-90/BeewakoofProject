package bewakoofTest;



import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.Screenshot;

public class ScreenshotTest extends BaseClass {
@Test
public void screenshot() {
Screenshot uk=new Screenshot(driver);
uk.PageScreenPgm();
uk.ElementScreenpgm();
}
}