package burlington;

import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Prime implements IReporter{
	WebDriver dr;
	@Test
	public void primme() {
		int x = 5;
		int count=0;
		for (int i = 1; i<x; i++) {
			if (x % i == 0) {
				count++;
				System.out.println("its a prime no");
			} else {
				System.out.println("not prime");

			}
		}

	}

}
