package test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import code.Homepage;

public class HomeTest extends BestTest{

	Homepage hp;
	
	@BeforeClass
	public void initObject() {
		hp=new Homepage(driver);
	}
	
	@Test
	public void logout() {
			hp.getwelcomelink().click();
		hp.getlogoutlink().click();
	}
}
