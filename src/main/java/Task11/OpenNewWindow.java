package Task11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/windows");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
    Thread.sleep(1000);
    // Get the current window handle
    String mainWindow = driver.getWindowHandle();

    // Get all window handles
    Set<String> allWindows = driver.getWindowHandles();

    // Switch to the new window
    for (String window : allWindows) {
        if (!window.equals(mainWindow)) {
            driver.switchTo().window(window);
            break;
        }
    }

    //  to print the text in new window
    String newPageText = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
    System.out.println("Output: " + newPageText);
    Thread.sleep(1000);
    // Close the new window and switch back to the main window
    driver.close();
    driver.switchTo().window(mainWindow);
 // Store and print the parent window handle
    driver.getWindowHandle();
    System.out.println("original window is active " );
    Thread.sleep(1000);
    driver.quit();
	}

}
