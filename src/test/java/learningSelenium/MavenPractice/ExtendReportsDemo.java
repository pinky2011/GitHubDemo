package learningSelenium.MavenPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtendReportsDemo {
	@Test
	public void Demo1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();
		 
	}

}
