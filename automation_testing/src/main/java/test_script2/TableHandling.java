package test_script2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TableHandling tablehaandling=new TableHandling();
tablehaandling.browserInitialization();
//tablehaandling.table();
tablehaandling.tableRow();
//tablehaandling.tableCell();
//tablehaandling.tableColoumn();
	}
public void table()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(table.getText());
}
public void tableRow()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]"));
	System.out.println(tablerow.getText());
}
public void tableCell()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tablecell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[2]"));
	System.out.println(tablecell.getText());
}
public void tableColoumn()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tablecoloumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
	for(WebElement list:tablecoloumn)
	{
	System.out.println(list.getText());
	}
}
}
