package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Enter User name
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 
		 //Enter Password
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 
		 //Click on Login Button
		 WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		 elementLoginButton.click();
		 
		 //Click on CRMSFA
		 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 
		 //Click on Leads
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 
		 //Click Find leads
		 driver.findElement(By.xpath("//a [text() = 'Find Leads']")).click();
		 
		 //Enter first name
		 driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[2]")).sendKeys("Raja");
		 
		//Click Find leads button
		 driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		 
		 Thread.sleep(3000);
		 //Click on first resulting lead
		 driver.findElement(By.xpath("(//div [@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		 	 
		 //Verify title of the page
		 System.out.println(driver.getTitle());
		 
		 //Click Edit
		 driver.findElement(By.xpath("//a [text() = 'Edit']")).click();
		 
		 //Change the company name
		 driver.findElement(By.xpath("//input [@id = 'updateLeadForm_companyName']")).clear();
		 
		 String companyNameUpdate = "Jasmin";
		 
		 driver.findElement(By.xpath("//input [@id = 'updateLeadForm_companyName']")).sendKeys(companyNameUpdate);
		 
		 //Click Update
		 driver.findElement(By.xpath("(//input [@class = 'smallSubmit'])[1]")).click();
		 
		 //Confirm the changed name appears
		 String upatedCompanyName = driver.findElement(By.xpath("(//span [text() = 'Company Name']/following::span)[1]")).getText();
		 
		 if (upatedCompanyName.contains(companyNameUpdate) == true) 
		 {
			 System.out.println("The Company Name is changed to " + companyNameUpdate);
		 }	
		 else
		 {
			 System.out.println("The Company Name is not changed");
		 }
		 
		 Thread.sleep(3000);
		 //Close the browser
		 
		 driver.close();
	}
}


