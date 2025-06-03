package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDownHandling dropdownhandling=new DropDownHandling();
dropdownhandling.browserInitialization();
dropdownhandling.dropDown();

	}
public void dropDown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(dropdown);
	//select.selectByContainsVisibleText("Red");
	//select.selectByIndex(2);
	select.selectByValue("Red");
}
}
