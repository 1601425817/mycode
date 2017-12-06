package office;

/*
 * 收文管理
 */
public interface ReceiveService {
	public void receiveRegistration(); //收文登记
	public void receivedistribute(int[] members); //收文分发
	public boolean receiveAudit(); //收文审核
	public void reviseOpinion(); //修改意见
	public boolean finalTrial(); //收文终审
}
