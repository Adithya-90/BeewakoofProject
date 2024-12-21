package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;


import bewakoofPage.PageSourcePgm;

public class PageSourceTest extends BaseClass {
@Test 
public void pagetest() {
	PageSourcePgm ob = new PageSourcePgm (driver);
	ob.AccessoriesPgm();
}
}
