package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements1 extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int textu = driver.findElement(By.id("username")).getLocation().getX();
		int textp = driver.findElement(By.name("pwd")).getLocation().getX();
		if (textu==textp) {
			System.out.println("username and password text field alligned successfully");
			
		}
		else
		{
			System.out.println("username and password textfield not alligned ");
		}
		driver.close();
	}

}
