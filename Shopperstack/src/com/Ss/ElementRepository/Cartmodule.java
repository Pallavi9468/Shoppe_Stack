package com.Ss.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartmodule {
	@FindBy(xpath="(//button[@id=\"addToCart\"])[5]")
	private WebElement addbtn;
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement cart ;
	
	
	@FindBy(xpath="(//button[text()='Remove from cart'])[1]")
	private WebElement removebtn ;
	//div[@class='cart_productDetails__Glgfl'])[1]
	@FindBy(xpath="(//button[text()='Remove from cart'])[3]")
	private WebElement rmovebtn ;	
	
	@FindBy(xpath="(//button[text()='Yes'])[3]")
	private WebElement yesbtn;
	
	@FindBy(xpath="//h3[text()='fashion2wear']")
	private WebElement visible;

	@FindBy(id="increase")
	private WebElement increase;

	@FindBy(xpath="//a[@id='home']")
	private WebElement home;
	
	@FindBy(xpath="//button[@name='addToCart'])[5]")
	private WebElement scroll;
	
	
	
	public Cartmodule(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public WebElement addcart()
{
return addbtn;

}

public WebElement gocart()
{
 return cart;
}

public WebElement remove()
{
 return removebtn;
}
public WebElement removered()
{
 return rmovebtn;
}

public WebElement yesbtn()
{
 return yesbtn;
}

public WebElement fav()
{
 return visible;
}

public WebElement inc()
{
 return increase;
}

public WebElement home()
{
 return home;
}

public WebElement scroll()
{
 return scroll;
}

}



