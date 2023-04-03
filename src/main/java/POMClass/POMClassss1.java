package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassss1
{
	@FindBy(xpath="//input[@name='username']") private WebElement username;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement button;
	
	public POMClassss1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUN(String UN) 
	{
		username.sendKeys(UN);
	}
	public void EnterPass(String Pass) 
	{
		password.sendKeys(Pass);
	}
	public void clickONLogin() 
	{
		button.click();
	}

}
