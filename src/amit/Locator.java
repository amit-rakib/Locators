package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
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
		
		
		

	}

}
