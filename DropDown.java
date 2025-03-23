
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import io.github.bonigarcia.wdm.WebDriverManager;

		public class DropDown {
			static WebDriver driver;
			public static void main(String[] args) {
				openUrl("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
				DropDownElements("Afghanistan");
				selectByIndex();
				selectByValue();
				selectByVisibleText();
			}
			public static void openUrl(String myUrl) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(myUrl);
			}
			public static void selectByIndex() {
				WebElement country = driver.findElement(By.xpath(".//option[contains(text(),'Afghanistan')]/parent::select"));
				Select select = new Select(country);
				select.selectByIndex(9); 
			}
			
			public static void selectByVisibleText() {
				WebElement country = driver.findElement(By.xpath(".//option[contains(text(),'Afghanistan')]/parent::select"));
				Select select = new Select(country);
				select.selectByVisibleText("Cambodia"); 
			}
			
			public static void selectByValue() {
				WebElement country = driver.findElement(By.xpath(".//option[contains(text(),'Afghanistan')]/parent::select"));
				Select select = new Select(country);
				select.selectByValue("COK"); 
			}	
			public static void DropDownElements(String countryName) {
				WebElement myCountry = driver. findElement(By.xpath(".//option[contains(text(),'Afghanistan')]/parent::select"));
				 myCountry.click();
				
				}}

		


	


