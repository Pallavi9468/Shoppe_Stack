package utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
public static void SelectOptions (WebElement element,Object data) {
	
	Select drop=UtilityObjects.DropDown(element);
	if(data instanceof Integer)
	{
	drop.selectByIndex((int) data);
	}
	else if(data instanceof String )
	{
	try {
	drop.selectByVisibleText((String) data);

	}catch (Exception e) {
		// TODO: handle exception
	drop.selectByValue((String) data);
	}}}
	
	public static void DeselectOptions (WebElement element,Object data) {
		
		Select drop=UtilityObjects.DropDown(element);
		if(data instanceof Integer)
		{
		drop.deselectByIndex((int) data);
		}
		else if(data instanceof String )
		{
		try {
		drop.deselectByVisibleText((String) data);

		}catch (Exception e) {
			// TODO: handle exception
		drop.deselectByValue((String) data);
		}
		}}
		
	public static void Deselectall(WebElement element)
	{
		Select drop=UtilityObjects.DropDown(element);
		drop.deselectAll();
	
	}
	
	public static WebElement GetOptions(WebElement element)
	{
		
		Select drop=UtilityObjects.DropDown(element);
		List<WebElement> opts = drop.getOptions();
		return (WebElement) opts;
			
	}
	
	
	}


