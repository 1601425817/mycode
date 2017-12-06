class RunThread extends Thread{
	private boolean isRunning = true;
	private String any = new String();
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
			this.isRunning = isRunning;
		
	}
	public void run()
	{
		System.out.println("进入了run");
		while(this.isRunning == true)
		{
			synchronized (any) {
			}
			
		}
		System.out.println("线程被终止了");
	}
}
public class TestVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经辅助为false");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
