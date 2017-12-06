import java.util.Comparator;

public class InheritableThreadExp{
	public static class local implements Runnable{
		private InheritableThreadLocal<Integer> threadLocal;
		public local(InheritableThreadLocal<Integer> threadLocal) {
			// TODO Auto-generated constructor stub
			this.threadLocal = threadLocal;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 100; i++)
			{
				threadLocal.set(i);
				System.out.println("A "+threadLocal.get());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritableThreadLocal<Integer> inheritableThreadLocal = new InheritableThreadLocal<Integer>();
		inheritableThreadLocal.set(3);
		local local = new local(inheritableThreadLocal);
		Thread thread = new Thread(local);
		thread.start();

	}

}
