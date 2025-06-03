package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ActionClass actionclass=new ActionClass();
actionclass.browserInitialization();
actionclass.action();
	}
public void action()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement action=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement action2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions=new Actions(driver);
	//actions.dragAndDrop(action, action2).build().perform();
	//actions.contextClick(action).build().perform();
	//actions.moveToElement(action).build().perform();
	actions.doubleClick(action).build().perform();
}
}
