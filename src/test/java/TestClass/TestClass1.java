package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import POMClass.POMClassss1;

public class TestClass1 extends BaseClass
{
	POMClassss1 page1;
	@BeforeClass
	public void OpenBroser() 
	{
		opneBrowser();
		 page1=new POMClassss1(driver);
	}
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException, InterruptedException 
{
	page1.EnterUN(UtilityClass.getDataFromPF("UN"));
	Thread.sleep(3000);
	page1.EnterPass(UtilityClass.getDataFromPF("PSW"));
	Thread.sleep(3000);
	page1.clickONLogin();
}
@Test 
public void TC() 
{}

@AfterMethod
public void logout() 
{
	
}

@AfterClass
public void closeB() 
{
	}
}
