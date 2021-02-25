package bburlington;

public class Break {

	public static void main(String[] args) throws Exception {
		int[]a= {30,50,20,60,80};
		for(int i:a) {
			if(i==60)
			{
				
				continue;
			}
			System.out.println(i);
			System.out.println("\n");
		}

	}

}
 