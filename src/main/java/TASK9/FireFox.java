package TASK9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();

   
        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("http://google.com");

        // Print the current page URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Reload the page
        driver.navigate().refresh();

   
        // Close the browser
        driver.quit();
    }
}
