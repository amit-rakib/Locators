package amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropdownLooping {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	    WebElement button =	driver.findElement(By.id("divpaxinfo"));
		
		
		button.click();
		String text = button.getText();
		System.out.println(text);

		
		Thread.sleep(2000);
		
//		int i=1;
//		while(i<5) {
//	        driver.findElement(By.id("hrefIncAdt")).click();
//	        i++;
//
//		}

        int i;
        for(i=0; i<5; i++) {
           driver.findElement(By.id("hrefIncAdt")).click();
           i++;
        }
        
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        String text1 = button.getText();
		System.out.println(text1);
	    
		driver.close();

	}

}
