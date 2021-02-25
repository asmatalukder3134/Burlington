package burlington;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loops {
WebDriver dr;
	public static void main(String[] args) {
		//int a=33;
		int []ar= {22,33,44,55};
		
		for(int i:ar) {
			System.out.println(i);
		}

	}
	void vv() {
		List<WebElement>we=dr.findElements(By.xpath(""));
		for(WebElement e:we) {
		String text=e.getText();
		}
	}

}
