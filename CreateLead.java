package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
		  
		  ChromeDriver driver = new ChromeDriver(); 		  
		  driver.get("http://leaftaps.com/opentaps/control/main");  
		  driver.manage().window().maximize();
		  
		  WebElement findElement = driver.findElement(By.id("username"));
		  findElement.sendKeys("DemoSalesManager");
		  
		  WebElement findElement2 = driver.findElement(By.id("password"));
		  findElement2.sendKeys("crmsfa");
		  
		  WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		  findElement3.click();
		  
		  WebElement findElement4 = driver.findElement(By.linkText("CRM/SFA"));
		  findElement4.click();
		  
		  WebElement findElement5 = driver.findElement(By.linkText("Leads"));
		  findElement5.click();
		  
		  WebElement findElement6 = driver.findElement(By.linkText("Create Lead"));
		  findElement6.click();
		  
		  WebElement findElement7 = driver.findElement(By.id("createLeadForm_companyName"));
		  findElement7.sendKeys("Jasmin");
		  
		  WebElement findElement8 = driver.findElement(By.id("createLeadForm_firstName"));
		  findElement8.sendKeys("Raja Vignesh");
			
		  WebElement findElement9 = driver.findElement(By.id("createLeadForm_lastName"));
		  findElement9.sendKeys("R");
		  
		  WebElement findElement10 = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		  findElement10.sendKeys("RV");
		  
		  WebElement findElement11 = driver.findElement(By.id("createLeadForm_departmentName"));
		  findElement11.sendKeys("Testing");
			
		  WebElement findElement12 = driver.findElement(By.id("createLeadForm_description"));
		  findElement12.sendKeys("Test Automation");
		  
		  WebElement findElement16 = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		  findElement16.sendKeys("9944610410");
		  
		  WebElement findElement13 = driver.findElement(By.id("createLeadForm_primaryEmail"));
		  findElement13.sendKeys("r.rajavignesh31@gmail.com");
		  
		  WebElement findElement14 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  
		  Select dd = new Select(findElement14); 
		  dd.selectByVisibleText("New York");
		  
		  WebElement findElement15 = driver.findElement(By.className("smallSubmit"));
		  findElement15.click();
		  
		  String title = driver.getTitle(); System.out.println(title);
			 
	}
}
