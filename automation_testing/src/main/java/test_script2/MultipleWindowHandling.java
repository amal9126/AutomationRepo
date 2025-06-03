package test_script2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleWindowHandling extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
multiplewindowhandling.browserInitialization();
multiplewindowhandling.multipleWindow();
	}
public void multipleWindow()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contactus=driver.findElement(By.xpath("//a[@id='contact-us']"));
	contactus.click();
	
	WebElement login=driver.findElement(By.xpath("//a[@id='login-portal']"));
	login.click();
	
	String parenthandle=driver.getWindowHandle();
	System.out.println(parenthandle);
	System.out.println("***************************");
	
	Set<String> allwindows=driver.getWindowHandles();
	for(String set:allwindows)
	{
		System.out.println(set);
		driver.switchTo().window(set);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("***************************");
		
	}
	

}
}
