package utilitiy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility 
{
	public static void selectProductByText (WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public static void selectProductByIndex (WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static ArrayList <String> getOptions (WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement>list = sel.getOptions();
		
		ArrayList <String> actList = new ArrayList <String>();
		for (WebElement ele : list)
		{
			actList.add(ele.getText());
		}
		return actList ;
	}
}
