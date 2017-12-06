import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
class service extends Thread{
	private ConcurrentLinkedDeque<Integer> concurrentLinkedDeque;
	public service(ConcurrentLinkedDeque<Integer> concurrentLinkedDeque)
	{
		this.concurrentLinkedDeque = concurrentLinkedDeque;
	}
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			concurrentLinkedDeque.add(i);
		}
	}
}
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
		service service1= new service(concurrentLinkedDeque);
		service service2 = new service(concurrentLinkedDeque);
		service service3 = new service(concurrentLinkedDeque);
		service1.start();
		service2.start();
		service3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(concurrentLinkedDeque.size());
	
	}

}
