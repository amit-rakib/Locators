package amit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		
		
		String[] text2 = text.split("'");
		
		// 0th index - Please use temporary password 
		// 1th index - rahulshettyacademy' to Login.
		
		String password = text2[1].split("'")[0];
		
		// 0th index - rahulshettyacademy
		// 1th index -  to Login.
		
		driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Amit");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(3000);

		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		String successMsg = driver.findElement(By.xpath("//*[.='You are successfully logged in.']")).getText();
		System.out.println(successMsg);
		
		driver.close();
		

	}

}
