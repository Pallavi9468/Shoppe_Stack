package shopperstack.Testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import shopperGeneric.Basescript;
//import shopperGeneric.Scrolltill;

public class Removefrmcart extends Basescript {
	@Test
	public void testCase2() 
	{
		
//	Scrolltill sc=new Scrolltill();
	cm.gocart().click();
//	sc.scrollby();
	ew.until(ExpectedConditions.elementToBeClickable(cm.remove()));
	cm.removered().click();
	cm.yesbtn().click();
	}

}
