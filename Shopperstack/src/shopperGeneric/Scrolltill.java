package shopperGeneric;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scrolltill extends Basescript {
	public void scrollby() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ele = cm.scroll();
	int x=ele.getLocation().getX();
	int y=ele.getLocation().getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	
	
	}
}
