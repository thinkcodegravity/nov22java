package threads;

public class MainProgram {
// sequential
	public static void main(String[] args) {
		System.out.println("main entered");
		ProgramA pa = new ProgramA();
		pa.start();

		ProgramB pb = new ProgramB();
		Thread t = new Thread(pb);
		t.start();
		
		ProgramC bathroom = new ProgramC();
		bathroom.start();

		ProgramD oxygen = new ProgramD();
		oxygen.start();

		ProgramE pe = new ProgramE();
		pe.start();
		
		
		oxygen.setPriority(Thread.MAX_PRIORITY);
		bathroom.setPriority(Thread.MIN_PRIORITY);
		
		// Program D = MAX
		// Program C = MIN
		System.out.println("exit Main");
	}

}
