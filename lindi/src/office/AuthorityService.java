package office;

import java.util.List;

/*
 * 权限管离
 */
public interface AuthorityService {
	public boolean addAuthority(int memberId, int authorityId); //添加权限
	public boolean changeAuthority(int memberId, int authorityId); //修改权限
	public boolean removeAuthority(int memberId, int authorityId); //删除权限
	public List<Authority> authoritySearching(String[] searchingArgs); //查找权限
}
