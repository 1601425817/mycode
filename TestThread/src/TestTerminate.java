
public class TestTerminate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();
		th1.start();
		try {
			Thread.sleep(2000);
			th1.flag = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class MyThread extends Thread
{
	public boolean flag = true;
	public void run()
	{
		while(flag) {
			System.out.println("i am running");
		}
	}
}