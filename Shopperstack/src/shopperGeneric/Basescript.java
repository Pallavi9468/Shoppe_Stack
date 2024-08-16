package shopperGeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Ss.ElementRepository.Cartmodule;
import com.Ss.ElementRepository.LoginPage;
import com.Ss.ElementRepository.Logoutmodule;


public class Basescript implements ApplicationConstants {
	
		public WebDriver driver;
		public WebDriverWait ew;
		ReadProperty rp;
		public Cartmodule cm;
		@BeforeClass
		public void OpenBrowser() throws Exception
		{
			System.setProperty(chrome_key,chrome_value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			 rp= new ReadProperty();
			cm=new Cartmodule(driver);
			ew=new WebDriverWait(driver, Timeout);
			driver.get(rp.url());
			driver.manage().timeouts().implicitlyWait(Timeout,TimeUnit.SECONDS);
			
		}
		@BeforeMethod
		public void LaunchApplication()
		{
		ew=new WebDriverWait(driver, extraTimeout);
		LoginPage lp=new LoginPage(driver);
		ew.until(ExpectedConditions.elementToBeClickable(lp.clklgn()));
		lp.clklgn().click();
		lp.Enterem().sendKeys(rp.usn());
		lp.Enterpsw().sendKeys(rp.psw());
		lp.ClickLogin().click();
		
		}
		
		@AfterMethod
		public void LogoutApplication(ITestResult result) throws Throwable
		{
			if(result.getStatus()==result.FAILURE)
			{
			CaptureScrshot.getDefects(driver, result.getName());
			}
			ew=new WebDriverWait(driver, Timeout);
			Logoutmodule lm= new Logoutmodule(driver);
			ew.until(ExpectedConditions.visibilityOf(lm.clklgn())).click();
			ew.until(ExpectedConditions.visibilityOf(lm.clkbtn())).click();
			
			
		}
		@AfterClass
		public void closeBrowser()
		{
		driver.quit();
		}
		
	}
	



