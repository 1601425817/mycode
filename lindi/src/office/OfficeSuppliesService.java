package office;

import java.util.List;

/*
 * �칫��Ʒ����
 */
public interface OfficeSuppliesService {
	public boolean officeSuppliesApplication(int id); //�칫��Ʒ����
	public boolean officeSuppliesAudit(int id); //�칫��Ʒ���
	public void officeSuppliesDistribute(int[] members); //�칫��Ʒ����
	public List<OfficeSupplies> officeSuppliesSearching(String[] searchingArgs); //�칫��Ʒ����
	public int officeSuppliesCount(); //�칫��Ʒͳ��
}