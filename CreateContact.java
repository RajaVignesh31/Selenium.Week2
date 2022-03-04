package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Raja Vignesh R");
		
		driver.findElement(By.id("lastNameField")).sendKeys("R");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("RV");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raja");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Test Automation");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("r.rajavignesh31@gmail.com");
		
		Select dd = new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")));
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Test Automation");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		System.out.println(driver.getTitle());
	}
}
