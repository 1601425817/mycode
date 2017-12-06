import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
	private static Timer timer = new Timer();
	static public class MyTask extends TimerTask{
		public void run()
		{
			
				System.out.println("i am running");
				this.cancel();
				System.out.println("end");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		MyTask task = new MyTask();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = "2017-9-21 16:39:00";
		Date date;
		
			date = simpleDateFormat.parse(dateString);
			timer.schedule(task, date,2);
			System.out.println("131");
			task.cancel();
			timer.cancel();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
