
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment3 {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			 // Open wikipedia website
	        driver.get("https://www.wikipedia.org");
	        //id
	        driver.findElement(By.id("search-form"));
	        driver.findElement(By.id("hiddenLanguageInput"));
	        //name
	        driver.findElement(By.name("go"));
	        driver.findElement(By.name("family"));
	        //classname
	        driver.findElement(By.className("search-container"));
	        driver.findElement(By.className("central-featured"));
	        //linkText
	        driver.findElement(By.linkText("all-languages-nav-label"));
	        driver.findElement(By.linkText("search"));
	        //PartialLinkText
	        driver.findElement(By.partialLinkText("es"));
	        driver.findElement(By.partialLinkText("fr"));
	        //css
	        driver.findElement(By.cssSelector("#js-link-box-es"));
	        driver.findElement(By.cssSelector(".central-featured-lang lang5"));
	        
	}
}
