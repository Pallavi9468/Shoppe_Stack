package shopperstack.Testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import shopperGeneric.Basescript;


public class Addtocart extends Basescript {
	
	@Test
	public void addCart()
	{
	ew.until(ExpectedConditions.elementToBeClickable(cm.gocart()));
	cm.gocart().click();
	ew.until(ExpectedConditions.visibilityOf(cm.remove()));
	System.out.println("if the condition is satisfied");
	if(cm.remove().isDisplayed()) {
	cm.inc().click();
		
	}
	
	else
	{
	//Scrolltill sc=new Scrolltill();
	cm.home().click();
	//sc.scrollby();
	ew.until(ExpectedConditions.elementToBeClickable(cm.addcart()));
	cm.addcart().click();

	}

}}
