package test_script;

public class BrowserCommands extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browsercommands=new BrowserCommands();
browsercommands.browserInitialization();
browsercommands.BrowserCommands();
browsercommands.quitAndClose();
	}
public void BrowserCommands()
{
	
	String title=driver.getTitle();
	//System.out.println(title);
	
	String url=driver.getCurrentUrl();
	//System.out.println(url);
	
	String source=driver.getPageSource();
	System.out.println(source);
	
}


}
