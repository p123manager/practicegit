package gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StepDef1 {
	@Test
	public void m1() throws Exception{
		String expected="facebook";
  WebDriver driver=new ChromeDriver();
  driver.get("http://www.facebook.com");
  String actual_title=driver.getTitle();
  System.out.println(actual_title);
  Thread.sleep(3000);
  if(actual_title.equals(actual_title)) {
	  
	  System.out.println("test case passed");
  }else
  {
	  System.out.println("test case failed");
  }
  driver.quit();
	}
  
}
