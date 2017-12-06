
public class TestThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TGThread tgThread = new TGThread("son1");
			TGThread tgThread2 = new TGThread("son2");
			ThreadGroup threadGroup = new ThreadGroup("group1");
			Thread th1 = new Thread(threadGroup, tgThread);
			Thread th2 = new Thread(threadGroup, tgThread2);
			threadGroup.setMaxPriority(5);
			th1.setPriority(10);
			th1.start();
			th2.start();
			try {
				Thread.sleep(5000);
				threadGroup.stop();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

class TGThread implements Runnable{
	public String name;
	public TGThread(String name)
	{
		this.name = name;
	}
	public void run()
	{
		while(true)
		{
			System.out.println("hello"+name);
		}
	}
}