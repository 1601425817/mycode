class obj{
	private int value;
	public obj(){
		this.value = 2;
	}
	public int get()
	{
		return value;
	}
	public void set(int value)
	{
		this.value = value;
	}
}
class TA extends Thread{
	
	private obj obj;
	
	public TA(obj obj)
	{
		this.obj = obj;
	}
	
	public void run()
	{
		obj.set(3);
	}
}
class TB extends Thread{
	
	private obj obj;
	
	public TB(obj obj)
	{
		this.obj = obj;
	}
	
	public void run()
	{
		System.out.println(obj.get());
	}
}
public class TestVo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj obj = new obj();
		TA ta = new TA(obj);
		ta.start();
	
		System.out.println(obj.get());
	}

}
