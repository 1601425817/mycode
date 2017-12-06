class print
{
	public void show(String string)
	{
		try {
			while(true)
			{
				synchronized (string) {
					System.out.println(Thread.currentThread().getName());
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
class ThreadC extends Thread{
	private print print;
	String string;
	public ThreadC(print print, String string)
	{
		this.print = print;
		this.string = string;
	}
	public void run() {
		print.show(string);
	}
}
class ThreadD extends Thread{
	private print print;
	String string;
	public ThreadD(print print,String string)
	{
		this.print = print;
		this.string = string;
	}
	public void run()
	{
		print.show(string);
	}
}
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "11";
		print print = new print();
		ThreadC threadC = new ThreadC(print, string);
		ThreadD threadD = new ThreadD(print, string);
		threadC.setName("c");
		threadD.setName("d");
		threadC.start();
		threadD.start();
		
	}

}
