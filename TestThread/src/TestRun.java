import javax.sound.midi.Track;

class resource {
	private int a;
	public resource()
	{
		this.a = 10;
	}
	public void show()
	{
		for(int i = 0; i< 100; i++)
		{
			System.out.println(Thread.currentThread().getName()+"no lock" +i);
		}
		synchronized (this) {
			for(int i = 0; i < 100; i++)
			{
				System.out.println(Thread.currentThread().getName()+"lock"+i);
			}
		}
	}
	synchronized public void add()
	{
		this.a = this.a+1;
		System.out.println(Thread.currentThread().getName()+"add time"+System.currentTimeMillis());
		System.out.println(1/0);
	}
}
class ThreadA extends Thread{
	private resource resource;
	public ThreadA(resource resource) {
		// TODO Auto-generated constructor stub
		super();
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.show();
	}
	
}


class ThreadB extends Thread{
	private resource resource;
	public ThreadB(resource resource) {
		// TODO Auto-generated constructor stub
		super();
		this.resource = resource;
	}
	@Override
	public void run() {
		
		resource.show();

	}
	
}

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   resource resource = new resource();
		   ThreadA threadA = new ThreadA(resource);
		   ThreadB threadB = new ThreadB(resource);
		   threadA.setName("threadA");
		   threadB.setName("threadB");
		   threadA.start();
		   threadB.start();
			
	}

}
