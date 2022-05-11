package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements5  extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean result = driver.findElement(By.xpath("//input[contains(@id,'keepLoggedIn')]")).isSelected();
		if(result)
		{
			System.out.println("check box is selected");
		}
		else
		{
			System.out.println("check box is not selected");
		}
		driver.close();
		
	}

}
