
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class Assigment_xpath {
			
			    public static void main(String[] args) {
			        WebDriverManager.chromedriver().setup();
			        WebDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
			        WebElement myElement =driver.findElement(By.xpath("//img[@alt='Mobiles']"));
			        Actions action=new Actions(driver);
			        action.click(myElement).perform();
			    }
			}
			      