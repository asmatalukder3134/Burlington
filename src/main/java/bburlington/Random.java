package bburlington;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Random {
	@Test
	public void randomn() {
		String rn=RandomStringUtils.randomAlphabetic(8);
		String rn1=RandomStringUtils.randomAlphabetic(7);
		String rn2=RandomStringUtils.randomAlphabetic(7);
		String rn3=RandomStringUtils.randomAlphabetic(7);
		String rn4=RandomStringUtils.randomAlphabetic(7);
		String s=rn.toString();
		String s1=rn1.toString();
		String s2=rn3.toString();
		String s3=rn.toString();
		String s4=rn4.toString();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
