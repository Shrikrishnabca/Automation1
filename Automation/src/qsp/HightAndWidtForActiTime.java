package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightAndWidtForActiTime extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Dimension a = driver.findElement(By.id("username")).getSize();
		Dimension b = driver.findElement(By.name("pwd")).getSize();
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("size of email and password textbox is matching");
		}
		else
			System.out.println("size of email and password textbox is not matching");
		driver.close();
	}

}
