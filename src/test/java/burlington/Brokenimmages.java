package burlington;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenimmages {
	WebDriver dr;

	void img() throws IOException, InterruptedException, AWTException {
		List<WebElement> e = dr.findElements(By.xpath("//a"));
		int size = e.size();
		for (int i = 0; i < size; i++) {
			String allLinks = e.get(i).getAttribute("href");
			URL url = new URL(allLinks);
			URLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			Thread.sleep(3000);
			int code = ((HttpURLConnection) http).getResponseCode();
			System.out.println(code);
			if (code >= 400) {
				e.get(i).getAttribute("src");
			} else {
				System.out.println("there is no broken image");
			}

		}
		WebElement drug = dr.findElement(By.xpath(""));
		WebElement dr0p = dr.findElement(By.xpath(""));
		Actions ac = new Actions(dr);
		ac.contextClick(dr.findElement(By.xpath(""))).build().perform();
		ac.doubleClick();

		ac.dragAndDrop(drug, dr0p);
		ac.click();
		dr.get("");
		String url = dr.getCurrentUrl();
		
		System.out.println(url);
		SoftAssert so=new SoftAssert();
		so.assertEquals("", "");
		so.assertAll();

		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.KEY_PRESSED);
		ro.keyPress(KeyEvent.KEY_RELEASED);
		ro.keyPress(KeyEvent.VK_DOWN);
	}
}
