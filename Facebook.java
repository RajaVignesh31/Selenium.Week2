package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raja Vignesh");
		//String emailAddressOr = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]")).getAttribute("class");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9944610410");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("9944610410");
		
		Thread.sleep(3000);
		
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByVisibleText("31");

		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Jul");

		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("1985");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	}
}
