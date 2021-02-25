package burlington;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Lion {
  static  int a =7;
  int p;
	@Test
		void bb() {
		int d;
			HashMap <Integer,String>hp=new HashMap<Integer,String>();
			hp.put(1, "aa");
			hp.put(2, "ccb");
			hp.put(3, "feec");
			hp.put(4, "ed");
			Set<Entry<Integer, String>> mp=hp.entrySet();
			System.out.println("entry mp:"+mp);
			
			
			Set<Integer>set=new HashSet<Integer>(hp.keySet());
			
			Iterator<Integer>it=set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
			
			if(hp.containsKey(3)) {
				System.out.println("yes");
			}else {
				System.out.println("no"); 
			}
		}
	

}
