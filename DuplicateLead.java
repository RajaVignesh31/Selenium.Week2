package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  
		  ChromeDriver driver = new ChromeDriver(); 		  
		  driver.get("http://leaftaps.com/opentaps/control/main");  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		  
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  
		  driver.findElement(By.linkText("Leads")).click();
		  
		  driver.findElement(By.linkText("Create Lead")).click();
		  
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jasmin");
		  
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja Vignesh");
			
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RV");
		  
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Automation");
		  
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("r.rajavignesh31@gmail.com");
		  	  
		  Select dd = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		  dd.selectByVisibleText("New York");
		  
		  driver.findElement(By.className("smallSubmit")).click();
		  
		  String title = driver.getTitle();
	      System.out.println(title);
	      
	      driver.findElement(By.linkText("Duplicate Lead")).click();
	      
	      driver.findElement(By.id("createLeadForm_companyName")).clear();
	      
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jasmin Infotech");
	      
	      driver.findElement(By.id("createLeadForm_firstName")).clear();
	      
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RV");
	      
	      driver.findElement(By.className("smallSubmit")).click();
	      
	      String newTitle = driver.getTitle();
	      System.out.println(newTitle);
	}
}
