
public class TestSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new mythread1();
		Thread thread = new Thread(r1,"name1");
		thread.start();	
		try {
			thread.join();
			for(int i = 0; i < 1000; i++)
			{
				System.out.println(i);
				Thread.sleep(100);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}

}
class mythread1 implements Runnable{
	
	public void run() {
		for(int i = 0; i < 100; i++)
			System.out.println("this is mythread1");
	}
	
}