class threadE implements Runnable{
	TestStatic obj;
	public threadE(TestStatic obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.showstaic();
	}
	
}
class threadF implements Runnable{
	TestStatic obj;
	public threadF(TestStatic obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.show();
	}
	
}


public class TestStatic{
	public synchronized static void showstaic()
	{
		System.out.println("this is static");
	}
	public synchronized void show()
	{
		System.out.println("this is not static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic testStatic = new TestStatic();
		threadE threadC = new threadE(testStatic);
		threadF threadD = new threadF(testStatic);
		
	}
}
