package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightandWidth extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		int h = driver.findElement(By.id("email")).getSize().getHeight();
		int w = driver.findElement(By.id("email")).getSize().getWidth();
		System.out.println("hight of email text box "+h);
		System.out.println("width of email text box"+w);
		driver.close();
		

	}

}
