package threads;

import java.util.Date;

public class ProgramA extends Thread{
	public void run(  ) {
		System.out.println("Program A entered");
		/*
		System.out.println("A sleeping:"+new Date());
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A wakeup:"+new Date());
		*/
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program A counted a "+i);
			if(i==5000000000l)
				break;
		}
		System.out.println("program A ends");
	}
}
