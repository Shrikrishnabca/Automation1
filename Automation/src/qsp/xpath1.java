package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/eclipse-workspace/Automation/data/ff.html");
		driver.findElement(By.xpath("//a[@name='n2']")).click();//xpath by attribute
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@name='n2' and @class='c2']")).click();//xpath by attribute and
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@name='n2' or @class='c1']")).click();//xpath by attribute or
		driver.navigate().back();
		driver.findElement(By.xpath("//a[not(@name='n2') ]")).click();//xpath by attribute not
		driver.close();

	}

}
