class myexcepion extends Exception{
	public myexcepion(String message)
	{
		super(message);
	} 
	public String toString() {
		StringBuffer sBuffer = new StringBuffer();
		StackTraceElement[] stackTraceElements = this.getStackTrace();
		for(StackTraceElement sTraceElement:stackTraceElements)
		{
			sBuffer.append(sTraceElement.toString());
		}
		return sBuffer.toString();
	}
}
public class Test1 {
	
	public static void divide(int a, int b) throws ArithmeticException {
		System.out.println(a/b);
	}

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		try {
			if(a==0)
				throw new myexcepion("³ýÊýÎª0");
		} catch (myexcepion e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
