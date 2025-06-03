package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckBox checkbox=new CheckBox();
checkbox.browserInitialization();
//checkbox.checkBox();
checkbox.checkBox2();
//checkbox.quitAndClose();
	}
public void checkBox()
{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkbox.click();
}
public void checkBox2()
{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	//checkbox.click();
	if(checkbox.isSelected())
	{
		System.out.println("already selected");
	}
	else
	{
	checkbox.click();	
	System.out.println("selected");
	
		
	}
}
}
