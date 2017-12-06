package office;

import java.sql.Date;
import java.util.List;

/*
 * �������
 */
public interface MeetingService {
	public boolean bookingMeeting(Date date, int roomId);  //Ԥ������
	public List<Meeting> searchingMeeting(String[] searchingArgs);  //���һ���
	public void changeMeeting(int meetingId, Date date, int roomId); //�޸Ļ���
	public void recordMeeting(); //��¼����
	
}
