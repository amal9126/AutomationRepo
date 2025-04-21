package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cssselector extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

}
	public void tagAndId()
	{
	WebElement tagandid=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagandid2=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagandid3=driver.findElement(By.cssSelector("button#button-two"));
	WebElement tagandid4=driver.findElement(By.cssSelector("button#button-first"));
	WebElement tagandid5=driver.findElement(By.cssSelector("input#button-two"));
	}
	public void tagAndClass()
	{
		WebElement tagandclass=driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement tagandclass2=driver.findElement(By.cssSelector("textarea.form-control"));
		WebElement tagandclass3=driver.findElement(By.cssSelector("div.header-top"));
		WebElement tagandclass4=driver.findElement(By.cssSelector("div.mb-sec"));
	}
	public void tagAndAttribute()
	{
		WebElement tagandattribute=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement tagandattribute2=driver.findElement(By.cssSelector("input[id='button-one']"));
		WebElement tagandattribute3=driver.findElement(By.cssSelector("textarea[id='description']"));
		WebElement tagandattribute4=driver.findElement(By.cssSelector("input[id='validationCustom01']"));
		WebElement tagandattribute5=driver.findElement(By.cssSelector("input[id='validationCustom03']"));
	}
	public void tagClassAndAttribute()
	{
		WebElement classandattribute=driver.findElement(By.cssSelector("input.form_control[id='validationCustom01']"));	
		WebElement classandattribute2=driver.findElement(By.cssSelector("input.form-check-input[id='gridCheck']"));
		WebElement classandattribute3=driver.findElement(By.cssSelector("input.check-box-list[id='check-box-two']"));
		WebElement classandattribute4=driver.findElement(By.cssSelector("textarea.form-control[id='description']"));
		WebElement classandattribute5=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
	}
	//1.Tag and ID(tag#id)
			//2.Tag and class(tag.class)
			//3.Tag and Attribute(tag[attribute=value]
			//4.Tag,class,and Attribute(tag.classname[attribute=value]

}


