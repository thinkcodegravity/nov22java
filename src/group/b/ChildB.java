package group.b;
import group.a.*;
public class ChildB extends Parent{
	public ChildB() {
		super();
	}
	public void method() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
