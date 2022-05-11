package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversing extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff3.html");
		String a = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();//forword traversing
		
		String b = driver.findElement(By.xpath("//tr[2]/td[1]/../td[2]")).getText();//backword traversing
		System.out.println("book name: "+a);
		System.out.println("book price: "+b);
		driver.close();
	}

}
