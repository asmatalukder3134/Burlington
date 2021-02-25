package burlington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Dog {
	@Test
	void dog() {
		int  p =22;
		String [] a = {"aa","dd","cc"};
		
		
		
		System.out.println("array:"+ a);
		List<String>li=Arrays.asList(a);
		System.out.println("after list"+" "+li);
		System.out.println("after array:"+li.toArray());
		Collections.reverse(li);
		Collections.sort(li);
		
		String d="ff";
		Arrays.asList(a);
		String[]li1= {"hhhh","uuuuu"};
		List<String>l=Arrays.asList(li1);
		System.out.println("after:"+l);
		Object[]ob=l.toArray();
		for(Object o:ob) {
			System.out.println("AFTER:"+o);
		}
		
		String s=new String("ff");
		d.equals(s);
		if(d==s) {
		
		}
		
	}
}
