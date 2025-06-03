package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessMethods accessmethods=new AccessMethods();
accessmethods.browserInitialization();
	}
public void parent()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
}
public void child()
{
	
	WebElement child=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
}
public void followingSibling()
{
	WebElement followingsibling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
}
public void following()
{
	WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
}
public void preceeding()
{
	WebElement preceeding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@id='collapsibleNavbar']"));
}
public void ancestor()
{
	WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
}
public void descendant()
{
	WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::li[3]"));
}
public void indexing()
{
	WebElement indexing=driver.findElement(By.xpath("(//button[@id='button-one']//preceding::div[@id='collapsibleNavbar'])[1]"));
}
}
