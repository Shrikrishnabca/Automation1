package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements4  extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean result = driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		if(result)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		driver.close();
		
	}

}
