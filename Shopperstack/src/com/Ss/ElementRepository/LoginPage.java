package com.Ss.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement lgnbtn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emtf ;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwtf ;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement lgn;	



public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public WebElement clklgn()
{
return lgnbtn;

}

public WebElement Enterem()
{
 return emtf;
}

public WebElement Enterpsw()
{
 return pwtf;
}


public WebElement ClickLogin()
{
return lgn;
}














}
