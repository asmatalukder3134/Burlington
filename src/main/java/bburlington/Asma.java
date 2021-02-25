package bburlington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asma {

	public static void main(String[] args) {
		
       
     String[]s= {"asma","salma","runa"};
  List l=   Arrays.asList(s);
  System.out.println(l);
 Object[]t= l.toArray();
 for(Object ob:t) {
	 System.out.println(ob);
 }
 List list=new ArrayList();
 list.add("dhaka");
 list.add("khulna");
 list.add("amulia");
 System.out.println("After add List:"+list);
 System.out.println("after add all:"+list.addAll(l));
  
	}
	

}
