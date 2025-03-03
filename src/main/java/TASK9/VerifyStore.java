package TASK9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyStore {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//to setup chrome
        WebDriver driver = new ChromeDriver();// to open chrome
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equals(title)) {
			System.out.println("Page landed on correct website");
		}
		else {
			System.out.println("Page not landed on correct website");
		}
	}

}
