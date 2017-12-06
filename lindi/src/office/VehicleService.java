package office;

import java.util.List;

/*
 * 车辆管理服务
 */
public interface VehicleService {
	public boolean carAudit(int carId); //车辆审核
	public boolean vehicleApplication(int carId); //车辆申请
	public void vehicleRegistration(int carId); //车辆登记
	public List<Vehicle> vehicleSearching(String[] searchingArgs); //车辆查询
	public int vehicleCount(); //车辆统计
}
