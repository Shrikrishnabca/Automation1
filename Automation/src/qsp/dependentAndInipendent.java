package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependentAndInipendent  extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff3.html");
		String price = driver.findElement(By.xpath("//td[.='selenium'][2]/../td[2]")).getText();//dependent and independent
		System.out.println("price of selenium is: "+price);
		driver.close();
		
	}

}
