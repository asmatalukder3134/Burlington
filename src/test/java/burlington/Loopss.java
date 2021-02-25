package burlington;

import org.testng.annotations.Test;

public class Loopss {
	@Test
	public void bb() {
		int a[] = { 66, 99, 77, 33, 131 };
		int max = a[0];
		int smax = a[0];
		for (int i=0;i<a.length;i++) {
			if ( max<a[i]) {
				smax =max;
				max = a[i];
			
			} 
			else if (smax <a[i]) {

				smax = a[i];
			}}
			System.out.println(max);
			System.out.println(smax);

		}
	}


