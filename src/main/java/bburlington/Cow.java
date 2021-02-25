package bburlington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Cow  extends Animal{
	Cow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Test
	void vv() {
		int [] a= {44,55,88,66};
	List<int[]>i=Arrays.asList(a);
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(99);
		ar.add(700);
		
		System.out.println(ar); 
		
		
	}
	

}
