package office;

import java.sql.Date;
import java.util.List;

/*
 * 会议管理
 */
public interface MeetingService {
	public boolean bookingMeeting(Date date, int roomId);  //预订会议
	public List<Meeting> searchingMeeting(String[] searchingArgs);  //查找会议
	public void changeMeeting(int meetingId, Date date, int roomId); //修改会议
	public void recordMeeting(); //记录会议
	
}
