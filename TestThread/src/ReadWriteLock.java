import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
	public static class TestReadWrite implements Runnable{
		public static int i;
		private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		public void write()
		{
			try {
				readWriteLock.writeLock().lock();
				i++;
			} finally {
				// TODO: handle finally clause
				readWriteLock.writeLock().unlock();
			}
			
		}
		public void read()
		{
			try {
				readWriteLock.readLock().lock();
				System.out.println(Thread.currentThread().getName()+" "+i);
			} finally {
				// TODO: handle finally clause
				readWriteLock.readLock().unlock();
			}
		}
		public void run() {
			for(int j = 0; j < 100; j++)
			{
				read();
				write();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReadWrite testReadWrite = new TestReadWrite();
		Thread threadA = new Thread(testReadWrite);
		Thread threadB = new Thread(testReadWrite);
		threadA.setName("threadA");
		threadB.setName("threadB");
		threadA.start();
		threadB.start();
	}

}
