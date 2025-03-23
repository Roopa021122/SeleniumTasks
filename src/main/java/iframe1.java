import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			driver.manage().window().maximize();
			WebElement myElement=driver.findElement(By.xpath(".//iframe[@name='globalSqa']"));
			driver.switchTo().frame(myElement);
			driver.findElement(By.xpath("(.//div[@class='plus_overlay_icon']/following-sibling::img)[4]")).click();
            Thread.sleep(2000);
	        driver.quit();
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	