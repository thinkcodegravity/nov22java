public class Operators {
	public static void main(String[] args) {
		// statement... variable declar, assignment, method call
		int a;
		int b=10;
		b=20;
		System.out.println("hi");
		// arithmetic oper
		int c=67;
		int d=30;
		int e=  c % d ;
		System.out.println(  e );
		//equality operator
		int f=20;
		int j=30;
		boolean res= ( f != j  );
		System.out.println( res );
				
		Person p1=new Person();//#abc , name john
		Person p2=new Person();//#pqr , name john
		
		p1.name="jane"; // #abc, name jane
		p2=p1;  // value of RHS #abc is copied onto variable LHS
		System.out.println(   p1==p2 );
		
		// relational operator
		// greater than less than
		int k=20;
		int l=20;
		System.out.println(  k <= l     );
		
		// unary
		int m=25;
		// + - = -, - - = +, -+=-, ++=+
		System.out.println(  -(m)   );
		
		int n=10;
		n++; // post... increment later after. not in current line
		++n;// pre... increment before the current line
		n--;
		--n;
		//System.out.println(n);
		
		int o=10;
		System.out.println(  o++ ); // print 10, o=11
		System.out.println(  ++o ); // o=12, print 12
		System.out.println(  o++ ); // print 12, o=13
		System.out.println(  --o ); // o=12 , print 12
		System.out.println(  o-- ); // print 12, o=11
		// 10 12 12 12 12 
		
		// logical invert
		boolean p=false;
		System.out.println( !p );
		
		// conditional operators
		//LHS and RHS should be boolean
		//LHS and RHS can have = boolean literal value, boolean variable,
		// expression that gives boolean output
		
		int q=10;
		int r=20;
		boolean s=false;
		System.out.println(   r==q || q<r   );
	
		// bitwise op
		System.out.println(   12 & 10);
		System.out.println(   12 | 10);
		System.out.println(   12 ^ 10);

	}
}
