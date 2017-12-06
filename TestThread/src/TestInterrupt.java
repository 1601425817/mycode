
public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		MyInterrupt t1 = new MyInterrupt(object);
		MyInterrupt t2 = new MyInterrupt(object);
		t1.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
		t2.start();
	}

}
class MyInterrupt extends Thread{
	Object object;
	public MyInterrupt(Object object) {
		this.object = object;
	}
	public void run() {
		synchronized(object) {
			try {
				this.sleep(3000);
				System.out.println(Thread.currentThread().getName()+"我是正常运行的");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("我是被吵醒的");
				
			}
		}
		
	}
}