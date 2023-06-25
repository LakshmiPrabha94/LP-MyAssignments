package week1.day4Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVerification {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a = new ChromeDriver();
		Thread.sleep(10);
		a.manage().window().maximize();
		Thread.sleep(10);
		a.get("https://www.leafground.com/input.xhtml");
		Thread.sleep(100);
		a.findElement(By.id("j_idt88:name")).sendKeys("Lakshmi"); //1.Type your name
		//Thread.sleep(100);
		a.findElement(By.name("j_idt88:j_idt91")).sendKeys("+India"); //2. Append Country to this City(doubt)
		Thread.sleep(100);
		boolean enabled = a.findElement(By.id("j_idt88:j_idt93")).isEnabled(); //3. Verify if text box is disabled
		System.out.println(enabled);
		a.findElement(By.id("j_idt88:j_idt95")).clear(); //4.Clear the typed text
		Thread.sleep(10);
		String text = a.findElement(By.id("j_idt88:j_idt97")).getText();//5.Retrieve the typed text(Not working)
		System.out.println(text);
		Thread.sleep(100);
		a.findElement(By.id("j_idt88:j_idt99")).sendKeys("devigaurangi1@gmail.com"); // 6. . Type email and Tab. Confirm control moved to next element
		a.findElement(By.id("j_idt88:j_idt99")).sendKeys(Keys.TAB);
		Thread.sleep(10);
		a.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am happy to be a TestLeaf student");//7. Type about yourself
		//a.findElement(By.id("j_idt88:j_idt101")).sendKeys(Keys.TAB);
		//Thread.sleep(100);
		//a.findElement(By.className("ql-editor ql-blank")).sendKeys("TestLeaf family"); //doubt
		//a.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER); // 9. Just Press Enter and confirm error message*
		//a.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).isDisplayed();
		a.close();
		
		
		
		//Dropdown
		ChromeDriver d = new ChromeDriver();
		Thread.sleep(10);
		a.manage().window().maximize();
		Thread.sleep(10);
		d.get("https://www.leafground.com/select.xhtml");
		
		//d.findElement(By.name("j_idt87")).click();
		Thread.sleep(500);
		//boolean selected = d.findElement(By.className("ui-selectonemenu")).isSelected();
		//System.out.println(selected);
		a.close();
		//Thread.sleep(10000);
		
		

	}

}
