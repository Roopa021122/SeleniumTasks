package Task10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//to setup chrome
        WebDriver driver = new ChromeDriver();// to open chrome
       driver.manage().window().maximize();//maximize window   
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("https://jqueryui.com/droppable/");//navigate url
       driver.switchTo().frame(0);//frame by index
      WebElement source = driver.findElement(By.id("draggable"));//source element-drag
      Thread.sleep(2000);
      WebElement target = driver.findElement(By.id("droppable"));//target element-drop
      Thread.sleep(2000);
      Actions builder = new Actions(driver);//Action interface
      builder.dragAndDrop(source, target).perform();//loading source and target in dragdrop
      String targetText = target.getText();
      System.out.println("Drop status: " + targetText);
      driver.switchTo().defaultContent();
      driver.quit();
	}

}
