package week1.day4Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver a = new ChromeDriver();
		
		a.get("http://leaftaps.com/opentaps/control/login"); //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		a.manage().window().maximize();
		
		a.findElement(By.id("username")).sendKeys("DemoSalesManager"); //DemoSalesManager/crmsfa / 2. Enter UserName and Password Using Id Locator
		a.findElement(By.id("password")).sendKeys("crmsfa");
		a.findElement(By.className("decorativeSubmit")).click(); //3. Click on Login Button using Class Locator
		
		a.findElement(By.linkText("CRM/SFA")).click(); // 4.Click on CRM/SFA Link
		
		a.findElement(By.linkText("Leads")).click(); //5. Click on Leads Button
		a.findElement(By.linkText("Create Lead")).click(); //6. Click on create Lead Button
        
//CREATE
		a.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); //7. Enter CompanyName using id Locator
		a.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");  //8. Enter FirstName using id Locator		
		a.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabha"); //9. Enter LastName using id Locator
		a.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("devigaurangi1@gmail.com");	//10. Enter your mail-id
		a.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8675076662");   // 11.phone number
		Thread.sleep(1000);
		
		a.findElement(By.name("submitButton")).click();  //12. Click on create Lead Button Using name Locator
		Thread.sleep(9000);
		
		a.close();
		
}

}
