
class MyObj
{
	synchronized public void show()
	{
		System.out.println(Thread.currentThread().getName()+" is show");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is show end");
	}
	
	public void run()
	{
		System.out.println("run");
		System.out.println("run is end");
	}
}
class Service{
	public void ser(MyObj myObj)
	{
		synchronized (myObj) {
			myObj.show();
		}
	}
	
	public void ser2(MyObj myObj)
	{
		myObj.run();
	}
}
class Thread1 extends Thread{
	private Service service;
	private MyObj myObj;
	public Thread1(Service service, MyObj myObj)
	{
		this.service = service;
		this.myObj = myObj;
	}
	public void run() {
		super.run();
		this.service.ser(myObj);
	}
	
}
class Thread2 extends Thread{
	private Service service;
	private MyObj myObj;
	public Thread2(Service service, MyObj myObj)
	{
		this.service = service;
		this.myObj = myObj;
	}
	public void run() {
		super.run();
		service.ser2(myObj);
	}
}
public class TestNoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		MyObj myObj = new MyObj();
		Thread1 thread1 = new Thread1(service,myObj);
		Thread2 thread2 = new Thread2(service,myObj);
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
	}

}
