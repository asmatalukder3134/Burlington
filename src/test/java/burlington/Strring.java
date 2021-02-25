package burlington;

public class Strring {

	public static void main(String[] args) {
		String s="Asma";
		String s2=new String("Asma");
		String s1="Talukder";
		String fullname=s+s1;
		System.out.println("full name:"+""+fullname);
		System.out.println(s.concat(s1));
System.out.println(s.charAt(0));
System.out.println(s.compareTo(s1));
System.out.println(s==s1); 
Boolean b=s.contains(s2);
System.out.println("contains method:"+b);

	}

}
