package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Score extends setProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scores/45916/csk-vs-lsg-7th-match-indian-premier-league-2022");
		String score = driver.findElement(By.xpath("//div[@class='cb-min-bat-rw']/h2")).getText();
		String cur = driver.findElement(By.xpath("//span[@ng-bind='match.miniscore.crr']")).getText();
		String rqe = driver.findElement(By.xpath("//span[@ng-bind='match.miniscore.rrr']")).getText();
		System.out.println("score:"+score+"  curent run rate:"+cur+" required run rate:"+rqe);
	}

}
