package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSE {
	
	public static void ScrollAction(WebDriver driver,WebElement element) {
		
	UtilityObjects.JSE(driver).executeScript("arguments[0].scrollIntoView();",element);

}
	
	public static void JseVClick(WebDriver driver,WebElement element) {
		
		UtilityObjects.JSE(driver).executeScript("arguments[0].click();",element);

	}
	
	public static void JsePassData(WebDriver driver,WebElement element,String data) {
		
		UtilityObjects.JSE(driver).executeScript("arguments[0].value='"+data+"'",element);

	}

	



}
