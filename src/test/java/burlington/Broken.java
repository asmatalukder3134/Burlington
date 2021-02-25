package burlington;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Broken {
	WebDriver dr;

	public void img() throws IOException, InterruptedException {
		List<WebElement> ele = dr.findElements(By.tagName("//img"));
		for (WebElement e : ele) {
			String link = e.getAttribute("src");
			URL url = new URL(link);
			URLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			Thread.sleep(3000);
			int code = ((HttpURLConnection) con).getResponseCode();
			if (code >= 400) {
				System.out.println("broken img");
			} else {
				System.out.println("no broken img");
			}
		}

	}

}
