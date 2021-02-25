package burlington;

import org.testng.annotations.Test;

public class Febonaci {
	@Test
	public void febo() {
		int febo1=1;
		int febo2=1;
		int febonaci=1;
		int x=8;
		for(int i=0;i<=x;i++) {
			febo1=febo2;
			febo2=febonaci;
			febonaci=febo1+febo2;
			
		}
		System.out.println("febonaci no is :"+febonaci); 
		
	}
	
}
