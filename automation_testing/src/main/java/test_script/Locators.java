package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locators locators=new Locators();
locators.browserInitialization();
locators.id();
//locators.quitAndClose();

	}
public void id()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	// WebElement elementname=driver.findElement(By.locator("locator value"));
	
	WebElement textfield=driver.findElement(By.id("single-input-field"));
//	textfield.sendKeys("hello");
	
	WebElement showmessage=driver.findElement(By.id("button-one"));
//	showmessage.click();
	
	WebElement textfield2=driver.findElement(By.id("value-a"));
	textfield2.sendKeys("hai");
	
	WebElement textfield3=driver.findElement(By.id("value-b"));
	
	WebElement gettotal=driver.findElement(By.id("button-two"));
	
	WebElement checkbox=driver.findElement(By.id("check-box-one"));
}
public void Classname()
{
	WebElement textfield=driver.findElement(By.className("header-top"));
	
	WebElement field=driver.findElement(By.className("mb-sec"));
	
	WebElement field2=driver.findElement(By.className("viewport"));
	
}

public void Name()
{
	WebElement name=driver.findElement(By.name("viewport"));
	WebElement name1=driver.findElement(By.name("keywords"));
	WebElement name2=driver.findElement(By.name("description"));
}

public void Linktext()
{
	WebElement link=driver.findElement(By.linkText("Ajax Form Submit"));
	WebElement link2=driver.findElement(By.linkText("Jquery Select2"));
	WebElement link3=driver.findElement(By.linkText("Radio Buttons Demo"));
}

public void Partiallinktext()
{
	WebElement link=driver.findElement(By.linkText("Ajax Form Su"));
	WebElement link2=driver.findElement(By.linkText("Jquery Sel"));
	WebElement link3=driver.findElement(By.linkText("Radio Buttons De"));
}

}



