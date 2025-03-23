import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {
	public static WebDriver driver;
	public static String month = "";
	public static String year = "";
	public static String date = "";


		public static void main(String[] args) throws InterruptedException {
			selectDateMonthYearFromDatePicker("4", "February", "2026");
		}
		
		public static void selectDateMonthYearFromDatePicker(String date, String month, String year) throws InterruptedException {
			openUrl("https://www.makemytrip.com/");
			Thread.sleep(2000);
			clickDateDropDown();
			openMonthAndYear(month, year);
			selectDate(month,year,date);
		}

		public static void openUrl(String myUrl) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(myUrl);
		}
		
		public static void clickDateDropDown() {
			driver.findElement(By.xpath(".//label[@for='departure']/span")).click();
		}
		
		public static void openMonthAndYear(String month, String year) throws InterruptedException {
			while(driver.findElements(By.xpath(".//div[@class='DayPicker-Caption']/div[text()='"+month+" "+year+"']")).size()==0) {
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//span[@aria-label='Next Month']")).click();
			}
		}
		
		public static void selectDate(String month, String year, String date) {
			driver.findElement(By.xpath(".//div[text()='"+month+" "+year+"']/parent::div/parent::div[@class='DayPicker-Month']//div[@class='dateInnerCell']//p[text()='"+date+"']")).click();
		}
		
	}

