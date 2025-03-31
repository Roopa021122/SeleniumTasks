package Task10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class signup_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//to setup chrome
        WebDriver driver = new ChromeDriver();// to open chrome
       
		//to open and maximize
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
        // locate signup and click
		driver.findElement(By.xpath(".//a[contains(text(),'Sign up')]")).click();
		//fill login form
		driver.findElement(By.xpath(".//Input[@id='name']")).sendKeys("Kiyanshi");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//Input[@id='email']")).sendKeys("kiyanshi@example.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("Kia@123");
		Thread.sleep(2000);
	    driver.findElement(By.xpath(".//Input[@id='mobileNumber']")).sendKeys("9638527410");
	    Thread.sleep(2000);
	    //click signup
	    driver.findElement(By.xpath(".//a[@id='signup-btn']")).click();
	    //wait to verify login 
	    Thread.sleep(2000);
	    driver.quit();
        System.out.println("Login Successful");
	}
}
