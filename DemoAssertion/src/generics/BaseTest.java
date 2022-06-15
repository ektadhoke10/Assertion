package generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver =null;

	public static void initializeWebdriver(String strUrl) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(strUrl);
		driver.manage().window().maximize();
	}

	public static void tearDown() {
		driver.quit();
	}
	
	public static void implicitWait(int intTimeInSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(intTimeInSecond));
	}
	
	
}
