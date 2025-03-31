package Task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//select iframe path
		driver.switchTo().frame(frame);   //switch to frame
    WebElement dateinput = driver.findElement(By.id("datepicker"));  //to click the  date text box
	dateinput.click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();  //click next button
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@data-date='22']")).click();  //to select date
    Thread.sleep(2000);
    String selectedDate = dateinput.getAttribute("value");  // to get output value in the datainput
    System.out.println("Selected Date Is:: " + selectedDate);
	driver.quit();
	}

}
