package gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StepDef1 {
	@Test
	public void m1() throws Exception{
  WebDriver driver=new ChromeDriver();
  driver.get("http://www.facebook.com");
  String title=driver.getTitle();
  System.out.println(title);
  Thread.sleep(3000);
  driver.quit();
	}
  
}
