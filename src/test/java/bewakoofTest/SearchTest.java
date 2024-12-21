package bewakoofTest;

import org.testng.annotations.Test;

import BewakoofBaseCls.BaseClass;
import bewakoofPage.Search;

public class SearchTest extends BaseClass {
	@Test
public void SearchField() {
	Search ic=new Search(driver);
	ic.SearchPgm();
	
}
}
