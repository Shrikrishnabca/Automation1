package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements6 extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean result = driver.findElement(By.name("username")).isEnabled();
		if(result)
		{
			System.out.println("text box is enabled");
		}
		else
		{
			System.out.println("text box is disbled");
		}
		driver.close();
		
	}

}
