import java.io.File;
import java.io.IOException;

public class Method3 {
	public Person test() {			
		Person p=new Person("john");
		p.name="jane";
		test2(p);
		return p;		
	}			
	public void test2(Person p2) {			
		p2.name="mike";		
		try {
			test3(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}			
	public void test3(Person p3) throws IOException {			
		p3.name="andy";
		test4(p3);	
	}	
	
	public void test4(Person p3) throws IOException {			
		p3.name="andy";
		test5(p3);
	}	
	
	public void test5(Person p3) throws IOException {			
		File f=new File("x:/training/file.txt");
			f.createNewFile();
		
		p3.name="andy";		
	}	

}
