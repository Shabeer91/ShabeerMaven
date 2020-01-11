import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFB extends ExcelWithSeleniumIntegration {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Shabeer Works\\SHABEER\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement (By.id("email")).sendKeys(getData(0, 0));
		driver.findElement (By.id("pass")).sendKeys(getData(0, 1));
		

	}

}
