package burlington;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home implements Interf {
WebDriver dr;
	public void login(String uname, String pword) {
		dr.findElement(By.xpath("")).sendKeys(uname);
		dr.findElement(By.id("")).sendKeys(pword);
		Loggi x=new Loggi();
		x.logi();
		 Logger log=Loggi.log;
		 log.info("login succesful");
		
	}

}
