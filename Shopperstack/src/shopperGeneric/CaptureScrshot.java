package shopperGeneric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScrshot implements ApplicationConstants {
	public static void getDefects(WebDriver driver,String Name) {
	Date d=new Date();
	String date=d.toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File perm=new File(Screenshot_path+date+" "+Name+" .png");
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	

}}
