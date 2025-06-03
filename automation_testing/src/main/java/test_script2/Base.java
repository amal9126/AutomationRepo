package test_script2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test_script2.Base;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.browserInitialization();
	}
	public WebDriver driver;
	public void browserInitialization()
{
    driver= new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
}
	public void quitAndClose()
	{
		//driver.quit();
		driver.close();	
	}
}
