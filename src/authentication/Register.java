package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {

		String email ="sarajawarneh@gmail.com";
		String pass = "Sarah12345@";
		String password = "Sarah12345@";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		
		Thread.sleep(3000);
		//click on register 
		WebElement regist= driver.findElement(By.className("js-header-login-link"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", regist);
		driver.findElement(By.className("js-header-login-link")).click();
		
		WebElement sendEmail = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", sendEmail);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(email);
		Thread.sleep(2000);
		WebElement clickEmail = driver.findElement(By.xpath("//div/button[.='Continue with email']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", clickEmail);
		driver.findElement(By.xpath("//div/button[.='Continue with email']")).click();
		
   
		Thread.sleep(3000);
		WebElement passTxt1 = driver.findElement(By.xpath("//input[@name='new_password']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", passTxt1);     
//		driver.findElement(By.xpath("//input[@name='new_password']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/input[@name='new_password']")).sendKeys(pass);
		Thread.sleep(4000);
		WebElement passTxt2 = driver.findElement(By.xpath("//input[@id='confirmed_password']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", passTxt2);   
		driver.findElement(By.xpath("//div/div/input[@id='confirmed_password']")).sendKeys(password);
		Thread.sleep(4000);
		WebElement createAcc = driver.findElement(By.xpath("//form/button[.='Create account']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", createAcc); 
		driver.findElement(By.xpath("//form/button[.='Create account']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//form/button[.='Create account']")).click();

	}

}
