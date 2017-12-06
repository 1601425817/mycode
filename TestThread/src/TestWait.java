
public class TestWait implements Runnable{

	private Object lock;
	public TestWait(Object lock)
	{
		this.lock = lock;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock = new Object();
		TestWait tWait = new TestWait(lock);
		Thread threadA = new Thread(tWait);
		threadA.start();
		Thread threadB = new Thread(tWait);
		threadB.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			try {
				System.out.println(Thread.currentThread().getName());
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
