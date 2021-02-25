package burlington;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Short {
	static WebDriver dr;
	
	

	public static void main(String[] args) throws InterruptedException {
		Set<Cookie> co = dr.manage().getCookies();
		dr.manage().addCookie(null);
		dr.manage().deleteCookie(null);
		co.size();

		for (Cookie c : co) {
			dr.manage().getCookies();
			System.out.println(c.getName() + " " + c.getValue());

		}
		Cookie coo = new Cookie("sssss", "1234");
		co.add(coo);
		co.size();
		dr.manage().getCookies();
		System.out.println(coo);
		boolean b=dr.findElement(By.xpath("")).isEnabled();
		System.out.println(b); 
		dr.switchTo().alert().sendKeys("");
		System.out.println(""); 
		Thread.sleep(3000);
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebDriverWait wait=new WebDriverWait(dr,21); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
	}}
