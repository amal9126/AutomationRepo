package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RadioButton radiobutton=new RadioButton();
radiobutton.browserInitialization();
//radiobutton.radioButton();
radiobutton.radioButton2();
//radiobutton.quitAndClose();
	}
public void radioButton()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobutton.click();
}
public void radioButton2()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobutton.click();
	
	if(radiobutton.isSelected())
	{
		System.out.println("already selected");
	}
	else
	{
		radiobutton.click();
		System.out.println("selected");
	}
}
}
