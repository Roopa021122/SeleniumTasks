import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();// it will download the chrome driver
//WebDriverManager.firefoxdriver().setup();// it will download the firefox driver		
		
        WebDriver driver = new ChromeDriver();// to open chrome
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver = new FirefoxDriver();// to open firefox
        driver.get("https://www.google.com");
		driver.manage().window().maximize();// to maximize
		driver.manage().window().minimize();// to minimize
	}

}
