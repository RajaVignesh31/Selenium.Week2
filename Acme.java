package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter Email Id
		 driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("kumar.testleaf@gmail.com");
		 
		 //Enter Password
		 driver.findElement(By.xpath("//input [@id = 'password']")).sendKeys("leaf@12");
		 
		 //Click login button
		 driver.findElement(By.xpath("//button [contains(text(), 'Login')]")).click();
		 
		 Thread.sleep(2000);
		 //Get the title of the page and print
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(2000);
		 //Click on Log Out
		 driver.findElement(By.xpath("//a [text() = 'Log Out']")).click();
		 
		 Thread.sleep(3000);
		 //Close the Browser
		 driver.close();
	}
}
