import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 // Open Amazon website
        driver.get("https://www.amazon.com");

        // Example 1 - Click on the Amazon logo 
        driver.findElement(By.id("nav-logo-sprites")).click();

        // Example 2 - Click on Search bar (not a click action, but can focus on it)
        driver.findElement(By.id("twotabsearchtextbox")).click();

        // Example 3 - Click on Cart
        driver.findElement(By.id("nav-cart-count")).click();

        // Example 4 - Click on Sign-In button (header)
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

        // Example 5 - Click on Returns & Orders
        driver.findElement(By.id("nav-orders")).click();

        // Close the browser
        driver.close();
	}

}
