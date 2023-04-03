package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass 
{
    public	WebDriver driver;
	public void opneBrowser() 
	{
		System.setProperty("webdriver.edge.driver","D:\\Eclips\\New folder\\edge\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
