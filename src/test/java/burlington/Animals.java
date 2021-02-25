package burlington;

import org.testng.annotations.Test;

public class Animals {
	@Test
	void bag() {
		int[] a = { 33, 55, 99, 66, 88, 120, };
		int max = a[0];
		int smax = a[0];
		for (int num : a) {
			if (num > max) {
				smax = max;
				max = num;

			} else if (num > smax) {
				smax = num;

			}
			//stem.out.println("max:" + max);
			//stem.out.println("smax:" + smax);
		}

	}

	@Test
	void fact() {
		int fact = 1;
		int number = 5;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial:" + "" + fact);

	}

	@Test
	void febonac() {
		int febo1 = 1, febo2 = 1, febonaci = 1;
		for (int i = 1; i <= 7; i++) {
			febonaci = febo1 + febo2;
			febo1 = febo2;
			febo2 = febonaci;
			//stem.out.println("febonacci:" + febonaci);

		}

	}
@Test
	void prim() {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				} else if (i % j == 0) {
					break;
				}
			}
		}

	}

}
