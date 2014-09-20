import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.DefaultSelenium;

public class Task01  {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();

        // And now use this to visit Huff
        driver.get("http://www.huffingtonpost.com");
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.cssSelector("a[href*='roger']")).click();
        String author = driver.findElement(By.cssSelector("a[rel*='author']")).getText();
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Page title is: " + author);
        //Close the browser
        driver.quit();
    }
}