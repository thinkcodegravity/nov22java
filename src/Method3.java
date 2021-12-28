import java.io.File;
import java.io.IOException;

public class Method3 {
	public Person test(Person p, int x) {			
		p.name="jane";		
		test2(p);		
		return p;		
	}			
	public void test2(Person p2) {			
		p2.name="mike";		
		test3(p2);		
	}			
	public void test3(Person p3) {			
		p3.name="andy";
		test4(p3);	
	}	
	
	public void test4(Person p3) {			
		p3.name="andy";
		test5(p3);
	}	
	
	public void test5(Person p3) {			
		File f=new File("x:/training/test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=10/0;
		
		
		p3.name="andy";		
	}	

}
