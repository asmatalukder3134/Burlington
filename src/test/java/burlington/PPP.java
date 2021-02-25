package burlington;

public class PPP {

	public static void main(String[] args) {
		
		for(int i=2;i<=5;i++) {
			for(int j=2;j<=5;j++) {
				if(i==j) {
					System.out.println(i);
					
				}else if(i%j==0) {
					break;
				}
			}
			
		}

	}

}
