package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AlertHandling alerthandling=new AlertHandling();
alerthandling.browserInitialization();
alerthandling.simpleAlert();
//alerthandling.promptAlert();

	}
public void simpleAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement simplealert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	simplealert.click();
	String a=driver.switchTo().alert().getText(); // to print the message in console
	driver.switchTo().alert().accept();
	System.out.println(a);
}
public void confirmationAlert() 
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement confirmationalert=driver.findElement(By.xpath(""));
	confirmationalert.click();
	driver.switchTo().alert().accept();
}
public void promptAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement promptalert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	promptalert.click();
	driver.switchTo().alert().sendKeys("hai");
	driver.switchTo().alert().accept();
}
}
