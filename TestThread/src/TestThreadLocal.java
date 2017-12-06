
public class TestThreadLocal {
	public static class local implements Runnable{
		private ThreadLocal<Integer> threadLocal;
		public local(ThreadLocal<Integer> threadLocal) {
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
	public static class local2 implements Runnable{
		private ThreadLocal<Integer> threadLocal;
		public local2(ThreadLocal<Integer> threadLocal) {
			// TODO Auto-generated constructor stub
			this.threadLocal = threadLocal;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 100; i > 0; i--)
			{
				threadLocal.set(i);
				System.out.println("B "+threadLocal.get());
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
		ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		local local = new local(threadLocal);
		local2 local2 = new local2(threadLocal);
		Thread threadA = new Thread(local);
		Thread threadb = new Thread(local2);
		threadA.start();
		threadb.start();

	}

}
