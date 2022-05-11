package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationExe extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		int a = driver.findElement(By.id("username")).getLocation().getX();
		int b = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(a);
		System.out.println(b);
		if(a==b)
		{
			System.out.println("aligned properly");
			
		}
		else
			System.out.println("not aligned properly");
		driver.close();
	}

}
