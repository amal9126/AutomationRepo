package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


public void relativeXpath()   //tagname[@attribute='value']
{
	WebElement relativexpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement relativexpath2=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement relativexpath3=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relativexpath4=driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement relativexpath5=driver.findElement(By.xpath("//input[@id='value-b']"));
}

public void contains()       //tagname[contains(@attribute,'value')]
{
	WebElement contains=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	WebElement contains2=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	WebElement contains3=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	WebElement contains4=driver.findElement(By.xpath("//input[contains(@id,'validationCustom01')]"));
	WebElement contains5=driver.findElement(By.xpath("//button [contains(@id,'button-two')]"));
}

public void startsWith()    //tagname[starts-with(@attribute,'value')
{
	WebElement startswith=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	WebElement startswith2=driver.findElement(By.xpath("//input[starts-with(@id,'validationCu')]"));
	WebElement startswith3=driver.findElement(By.xpath("//input[starts-with(@id,'value')]"));
	WebElement startswith4=driver.findElement(By.xpath("//button [starts-with(@id,'button-t')]"));
	WebElement startswith5=driver.findElement(By.xpath("//button [starts-with(@id,'button-o')]"));
}

public void text()   //tagname[text()='value']
{
	WebElement text=driver.findElement(By.xpath("//label[text()='Last name']"));
	WebElement text2=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text3=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement text4=driver.findElement(By.xpath("//label[text()='Subject']"));
	WebElement text5=driver.findElement(By.xpath("//label[text()='Description']"));
	
}

public void and()    //tagname[@attribute='value' and @attribute='value']
{
	WebElement and=driver.findElement(By.xpath("//input[@id='single-input-field' and @class=\"form-control\"]"));
	WebElement and2=driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
	WebElement and3=driver.findElement(By.xpath("//input[@id='value-b' and @class='form-control']"));
	WebElement and4=driver.findElement(By.xpath("//button[@id='button-two' and @class='btn btn-primary']"));
	WebElement and5=driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
}

public void or()     //tagname[@attribute='value' or @attribute='value']
{
	WebElement or=driver.findElement(By.xpath("//input[@id='single-input-field' or @class=\"form-control\"]"));
	WebElement or2=driver.findElement(By.xpath("//input[@id='value-a' or @class='form-control']"));
	WebElement or3=driver.findElement(By.xpath("//input[@id='value-b' or @class='form-control']"));
	WebElement or4=driver.findElement(By.xpath("//button[@id='button-two' or @class='btn btn-primary']"));
	WebElement or5=driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']"));
}

}

