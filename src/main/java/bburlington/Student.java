package bburlington;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Student {
	static WebDriver dr;

	public static void main(String[] args) {

	}

	String name;
	String gender;
	int ph;

	Student() {
		ph = 1111111111;
		System.out.println("Phone no is:" + ph);
	}

	Student(String name, String grade) {
		System.out.println("Name is:" + name);
		System.out.println("Grade is:" + grade);

	}

	Student(String common) {
		List<WebElement> elements = dr.findElements(By.xpath(""));
		for (WebElement e : elements) {

			String text = e.getText();
			if (text.contains(common)) {
				e.click();
			}
		}
	}

	void information() {
		System.out.println("Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("phone no:" + ph);

	}

	void displayinfo(String n, int i) {
		name = n;
		ph = i;
		System.out.println("Name is:" + name);
		System.out.println("Phone no is:" + ph);

	}

	String vc() {
		String name = "asma";
		return name;

	}

	void vv(String com) {
		List<WebElement> el = dr.findElements(By.xpath(""));
		for (WebElement we : el) {
			String text = we.getText();
			if (text.contains(com)) {
				we.click();

			}
		}
	}

	void login() {
		dr.findElement(By.xpath("")).click();
	}

	void set(String name, String pw) {
		dr.findElement(By.xpath("")).sendKeys("");
		dr.findElement(By.xpath("")).sendKeys("");
	}
}
