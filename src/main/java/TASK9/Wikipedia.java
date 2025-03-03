package TASK9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//to setup chrome
        WebDriver driver = new ChromeDriver();// to open chrome
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
        driver.findElement(By.xpath(".//span[text()='History']")).click();
    String title=  driver.findElement(By.xpath(".//h2[@id='History']")).getText();
        System.out.println("Title of the Section is:"+title);
	}

}
