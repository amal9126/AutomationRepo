package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frames frames=new Frames();
frames.browserInitialization();
frames.frame();
	}
public void frame()
{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(iframe);
	WebElement link=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	link.click();
}
}
