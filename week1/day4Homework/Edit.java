package week1.day4Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			ChromeDriver x = new ChromeDriver();
			//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.firefox());
			x.manage().window().maximize();
			x.get("http://leaftaps.com/opentaps/control/main"); // Launch the browser
			Thread.sleep(900);
			x.findElement(By.id("username")).sendKeys("DemoSalesManager"); //DemoSalesManager/crmsfa / Enter UserName and Password Using Id Locator
			x.findElement(By.id("password")).sendKeys("crmsfa");
			Thread.sleep(900);
			x.findElement(By.className("decorativeSubmit")).click(); //3. Click on Login Button using Class Locator
			Thread.sleep(900);
			x.findElement(By.linkText("CRM/SFA")).click(); // 4.Click on CRM/SFA Link
			Thread.sleep(900);
			x.findElement(By.linkText("Leads")).click(); //5. Click on Leads Button
			Thread.sleep(900);
			x.findElement(By.linkText("Create Lead")).click(); //6. Click on create Lead Button
			Thread.sleep(900);
			x.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
			Thread.sleep(6000);//7. Enter CompanyName using id Locator
			x.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");  //8. Enter FirstName using id Locator		
			Thread.sleep(900);
			x.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabha"); //9. Enter LastName using id Locator
			Thread.sleep(1000);
			x.findElement(By.name("submitButton")).click();  //12. Click on create Lead Button Using name Locator
	//UPDATE//
			x.findElement(By.linkText("Edit")).click();
			Thread.sleep(900);
			//x.get("updateLeadForm?partyId=11304");
			//x.findElement(By.tagName("updateLeadForm?partyId=11304"))
			x.findElement(By.id("updateLeadForm_companyName")).sendKeys("EditedCompName");
			Thread.sleep(900);
			x.findElement(By.name("submitButton")).click();
			
			Thread.sleep(6000);
			x.close();			
		}
	}