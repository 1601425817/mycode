package office;

import java.util.List;

/*
 * Ȩ�޹���
 */
public interface AuthorityService {
	public boolean addAuthority(int memberId, int authorityId); //����Ȩ��
	public boolean changeAuthority(int memberId, int authorityId); //�޸�Ȩ��
	public boolean removeAuthority(int memberId, int authorityId); //ɾ��Ȩ��
	public List<Authority> authoritySearching(String[] searchingArgs); //����Ȩ��
}