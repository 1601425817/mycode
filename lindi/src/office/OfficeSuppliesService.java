package office;

import java.util.List;

/*
 * 办公用品管理
 */
public interface OfficeSuppliesService {
	public boolean officeSuppliesApplication(int id); //办公用品申请
	public boolean officeSuppliesAudit(int id); //办公用品审核
	public void officeSuppliesDistribute(int[] members); //办公用品发放
	public List<OfficeSupplies> officeSuppliesSearching(String[] searchingArgs); //办公用品查找
	public int officeSuppliesCount(); //办公用品统计
}
