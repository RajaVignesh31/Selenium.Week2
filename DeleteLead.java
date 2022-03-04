package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead 
{
	public static void main(String[] args) throws InterruptedException 
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
		
		driver.findElement(By.linkText("Leads")).click();		
		
		driver.findElement(By.xpath("//a [text() = 'Find Leads']")).click();
		
		driver.findElement(By.xpath("//span [text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		WebElement firstLeadID = driver.findElement(By.xpath("(//div [@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadID = firstLeadID.getText();
		System.out.println(leadID);
		
		firstLeadID.click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a [text() = 'Find Leads']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[1]")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		
		String text1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

		String text2 = "No records to display";
		
		if(text1.equals(text2)) 
		{
			System.out.println("Lead is Deleted");
		}
		else 
		{
			System.out.println("Lead is not Deleted");
		}
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
