package example.thread;

public class PrinterMain {


	public static void main(String[] args) {
		Printer p1 = new Printer("p1", 5);
		Printer p2 = new Printer("p2", 11);

		p1.start();
		p2.start();
		
		System.out.println("finished!");
	}

}
