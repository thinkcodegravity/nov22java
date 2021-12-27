
public class Reference {

	public static void main(String[] args) {		
		 int a=10; // primitive variable	
		 Student s1=new Student(); // refernce variable	
		 Student s2=new Student(); // refernce variable	
		 s2.name="jane";	
		 s1=s2;	
		 s2=new Student();	
		 s1.age=a;	
		 s2.age=20;	
		 s1.name="john";	
		 System.out.println(s1.name);	
		 System.out.println(s2.name);	
		 System.out.println(s1.age);	
		 System.out.println(s2.age);	
	}		
		


}
