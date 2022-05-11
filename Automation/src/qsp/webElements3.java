package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements3 extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int a1 = driver.findElement(By.name("username")).getRect().getX();
		int a2 = driver.findElement(By.name("username")).getRect().getY();
		int a3 = driver.findElement(By.name("username")).getRect().getHeight();
		int a4 = driver.findElement(By.name("username")).getRect().getWidth();
		int b1 = driver.findElement(By.name("pwd")).getRect().getX();
		int b2 = driver.findElement(By.name("pwd")).getRect().getY();
		int b3 = driver.findElement(By.name("pwd")).getRect().getHeight();
		int b4 = driver.findElement(By.name("pwd")).getRect().getWidth();
		if(a1==b1&&a3==b3&&a4==b4)
		{
			System.out.println("text fild alligned properly and size is same");
		}
		else if(a1==b1&&a3==b3&&a4!=b4)
		{
			System.out.println("text fild alligned properly and size is not same");
		}
		else
		{
			System.out.println("text fild alligned properly and size is not same");
		}
		System.out.println("y axis of username is"+a2);
		System.out.println("y axis of password is"+b2);
		driver.close();
		
	}

}
