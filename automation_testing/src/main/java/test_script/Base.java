package test_script;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base base=new Base();
base.browserInitialization();
	}
public WebDriver driver;
	public void browserInitialization()
{
    driver= new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
}
	public void quitAndClose()
	{
		//driver.quit();
		driver.close();	
	}
}
