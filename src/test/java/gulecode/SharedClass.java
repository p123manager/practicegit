package gulecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SharedClass {
	// open browser
	@Test
	public void m1() {
	WebDriver driver = new ChromeDriver();
	//lunch site
	driver.get("http://www.facebook.com");
	//close site
	driver.close();
	}
}
