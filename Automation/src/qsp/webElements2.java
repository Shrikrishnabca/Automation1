package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements2  extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int a1 = driver.findElement(By.id("username")).getSize().getHeight();
		int a2 = driver.findElement(By.id("username")).getSize().getWidth();
		int b1 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int b2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		if(a1==b1 && a2==b2)
		{
			System.out.println("hignt and width of username and password textfield same");
		}
		else
		{
			System.out.println("hight and width of username and password text field not same");
		}
		driver.close();
	}

}
