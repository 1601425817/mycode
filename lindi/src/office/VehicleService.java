package office;

import java.util.List;

/*
 * �����������
 */
public interface VehicleService {
	public boolean carAudit(int carId); //�������
	public boolean vehicleApplication(int carId); //��������
	public void vehicleRegistration(int carId); //�����Ǽ�
	public List<Vehicle> vehicleSearching(String[] searchingArgs); //������ѯ
	public int vehicleCount(); //����ͳ��
}
