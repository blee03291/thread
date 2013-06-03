package example.thread;

public class Printer extends Thread{

	String name;
	int interval;
	public Printer(String name, int interval) {
		this.name = name;
		this.interval = interval;
	}
	
	public void run(){
		for(;;){
			
			try{
				Thread.sleep(interval * 1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				System.exit(1);
			}
			System.out.println("Printer(" + name + ") printed");
		}
	}

}
