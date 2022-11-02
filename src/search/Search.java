package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		driver.findElement(By.xpath("//div/label/input[@id='ss']")).sendKeys("Amman");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		
		
	}

}
