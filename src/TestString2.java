
public class TestString2 {

	public static void main(String[] args) {
		String s1="john";		
		String s2="jane";		
		String s3="JOHN";		
		String s4="john";		
		String s5=new String("john");		
		String s6=new String("john");		
				
		if(		s1.equalsIgnoreCase(s3)  )		
			System.out.println("hi");	
		else		
			System.out.println("bye");
			
		String greeting="hi how are you";
		String[] s=greeting.split(" ");
		System.out.println(  s[0] );
		System.out.println(  s[1] );
		System.out.println(  s[2] );
		System.out.println(  s[3] );

		String name="john doe"; // name #abc john doe
		name=name.replaceAll(" ", "-"); // name #pqr , #pqr john-doe
		System.out.println(name);
		
		name=name.toUpperCase();
		System.out.println(name);
		
	}

}
