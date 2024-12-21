package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.BrokenLink;

public class BrkenlinkTest extends BaseClass{
@Test
public void Brokenpgm() {
	BrokenLink ok=new BrokenLink(driver);
	ok.BrokenPgm();
}
}
