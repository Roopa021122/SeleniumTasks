import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CheckboxesAndRadioButton {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        // **Step 1: Select all checkboxes**
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Checkboxes: " + checkboxes.size());

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(2000);

        // **Step 2: Deselect all checkboxes**
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(2000); 

        // **Step 3: Select all radio buttons**
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total Radio Buttons: " + radioButtons.size());

        for (WebElement radioButton : radioButtons) {
            radioButton.click();
            Thread.sleep(2000); 
        }
 driver.quit();
    }
}
