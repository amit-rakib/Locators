package amit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class handleDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	    WebElement staticDropdown =	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown = new Select(staticDropdown);
	    
	    
	    // Select By Index
	    dropdown.selectByIndex(3);
        String text = dropdown.getFirstSelectedOption().getText();
        System.out.println(text);
      
        // Select By Visible Text
        dropdown.selectByContainsVisibleText("AED");
        String text2 = dropdown.getFirstSelectedOption().getText();
        System.out.println(text2);
        
        // Select By Value
        dropdown.selectByValue("INR");
        String text3 = dropdown.getFirstSelectedOption().getText();
        System.out.println(text3);

	}

}
