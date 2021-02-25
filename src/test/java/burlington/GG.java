package burlington;

import org.testng.annotations.Test;

public class GG {
	@Test
	public void max() {
		int[] a = { 33, 55, 88, 99, 100, 99, 88 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("max no is:" + max);

	}

	@Test
	public void min() {
		int[] a = { 33, 55, 88, 99, 100, 99, 88 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("min no is :" + min);

	}
}
