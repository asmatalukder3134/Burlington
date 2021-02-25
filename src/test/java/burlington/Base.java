package burlington;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Base {
	WebDriver dr;
@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("");
		
		

	}
@Test
void vv() {
	
}
}
