package com.Ss.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutmodule {
	
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")
	private WebElement probtn;	
	
	@FindBy(xpath="(//div[@class='MuiListItemIcon-root css-1f8bwsm'])[6]")
	private WebElement logoutbtn;



public Logoutmodule (WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public WebElement clklgn()
{
return probtn;

}


public WebElement clkbtn()
{
 return logoutbtn;
}

}
