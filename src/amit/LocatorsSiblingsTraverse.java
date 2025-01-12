package amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsSiblingsTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Absulate xpath if you start from the top means from htlm tag that is called absulate xpath and it starts with one / slash
		// Parent to child traverse
		//driver.findElement(By.xpath("//html/body/header/div/button[1]")).click();
		
		
		// Relative xpath if you start from anywhere at the middle, at any tag that is called relative xpath and it starts with // slash
		// Parent to child traverse
		//driver.findElement(By.xpath("//header/div[1]")).click();
		
		
		// Siblings traverse 
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		
		// Child to Parent traverse 
	     String text = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText();
		System.out.println(text);
		

	}

}
