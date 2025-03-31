package Task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintMultipleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("http://the-internet.herokuapp.com/nested_frames");
    Thread.sleep(1000);
 // Switch to top frame
    driver.switchTo().frame("frame-top");
    Thread.sleep(1000);
    // Switch to left frame and verify text
    driver.switchTo().frame("frame-left");
    System.out.println(driver.findElement(By.tagName("body")).getText());
    Thread.sleep(1000);
    // Switch back to top and then to middle frame
    driver.switchTo().parentFrame();
    driver.switchTo().frame("frame-middle");
    System.out.println(driver.findElement(By.tagName("body")).getText());
    Thread.sleep(1000);
    // Switch back to top and then to right frame
    driver.switchTo().parentFrame();
    driver.switchTo().frame("frame-right");
    System.out.println(driver.findElement(By.tagName("body")).getText());
    Thread.sleep(1000);
    // Switch to bottom frame and verify text
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame-bottom");
    System.out.println(driver.findElement(By.tagName("body")).getText());
    Thread.sleep(1000);
    driver.quit();
}
}