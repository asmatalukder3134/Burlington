package burlington;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class JJ {
     @Test
	public void vv() {
		String []ar= {"aa","ff","cc"};
		
		List<String>li=Arrays.asList(ar);
		li.clear();
		li.add("alo");
		li.add("gg");
		li.remove(0);
		
		
		System.out.println(li);
		
		
	}

}
