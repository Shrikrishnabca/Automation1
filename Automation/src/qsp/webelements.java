package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webelements extends setProperty{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		String a = driver.getTitle();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("demo@opensourcebilling.org");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[.='Submit']")).click();
        driver.findElement(By.xpath("//a[.='Skip']")).click();
        JavascriptExecutor j=(JavascriptExecutor)driver;
        //j.executeScript(a, args);
       //("//i[.='more_vert']"))).click().perform();
        driver.findElement(By.xpath("//a[@class='logout text-align']")).click();
        String b = driver.getTitle();
        if (a.equals(b)) {
        	System.out.println("login functionality working finee");
			
		}
        else
        {
        	System.out.println("somthing went wrong!!!!!");
        }
	}

}
