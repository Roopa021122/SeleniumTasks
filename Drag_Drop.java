import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class Drag_Drop {

		

			public static WebDriver driver;
			
			public static void main(String[] args) {
				methodUsedToDragAndDrop();
			}
			
			public static void methodUsedToDragAndDrop() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
				
				WebElement mySourceElement = driver.findElement(By.xpath("(.//h5[text()='High Tatras 2']/parent::li"));
				WebElement myTargetElement = driver.findElement(By.id("trash"));
				
				waitForFixTime(2000);
				
				Actions myAction =  new Actions(driver);
				myAction.dragAndDrop(mySourceElement, myTargetElement).perform();
				
			}
			
			public static void waitForFixTime(int time) {
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		

	}

