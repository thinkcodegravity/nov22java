import java.util.*;

public class CollectionsTest {

	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String>();
		LinkedHashSet<String> s2=new LinkedHashSet<String>();
		TreeSet<String> s3=new TreeSet<String>();
		s1.add("john"); s1.add("jane"); s1.add("john"); s1.add("mike");
		s2.add("john"); s2.add("jane"); s2.add("john"); s2.add("mike");
		s3.add("john"); s3.add("jane"); s3.add("john"); s3.add("mike");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("*************");
		
		HashSet<String> al=new TreeSet<String>();
		 al.add("john");
		 al.add("jane");
		 al.add("john");
		 al.add(1,"ron");
		 
		 System.out.println(al);
		 al.remove("mike");
		 al.remove(1);
		 
		 System.out.println(al.get(0));
		 
		 LinkedList<Person> a2=new LinkedList<Person>();
		 Person p1=new Person("");
		 Person p2=new Person("");
		 a2.add(p1);
		 a2.add(p2);
		 
		 
	}

}
