package amit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		// Locators are -
		// ID
		//Xpath
		// CSS selector
		// name
		// Class Name
		// Tag Name
		// Link Text
		// Partial Link Text
		
		
//		<input type="text" placeholder="Username" id="inputUsername" value="">
//
//		here,
//
//		input - Tag name
//
//		type, placeholder, id, value - Attributes
//
//		text, Username, inputUsername - Value of Attributes
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		
//		How to make CSS Selector:
//
//			1. tag name.classname  ( if class name available)
//
//			2. tagname#id   (if id available)
//
//			3. tagname[attribute='value']
					
	    String text = driver.findElement(By.cssSelector("p.error")).getText();
	    System.out.print(text);
	    
	    // Link Text
	    
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    // Xpath
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("amit");
	    
	    // CSS Selector
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("AmitRakib");
	    
	    // Xpath with index
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    
	    // CSS Selector with nth child index
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("amit123@gmail.com");
	    
	    // Xpath with Parent Child traverse index
	    driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("1704622382");
	    
	    
	    Thread.sleep(3000);
	    
	    // CSS Selector with dot and Class Name
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
	    // CSS Selector with Parent Child traverse index
        String text2 =  driver.findElement(By.cssSelector("form p")).getText();  //Note: in css selector parent-child traverse do not need \ slashes 
        System.out.println(text2);

	}

}
