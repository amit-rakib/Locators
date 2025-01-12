package amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Amit");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		

	    Thread.sleep(3000);

        String Actual = driver.findElement(By.tagName("p")).getText();
        System.out.println(Actual);
        
        String Expected = "You are successfully logged in.";
        
        Assert.assertEquals(Actual, Expected);
        
        driver.findElement(By.className("logout-btn")).click();
        
        driver.close();
		

	}

}
