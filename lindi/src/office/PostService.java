package office;

/*
 * ���Ĺ���
 */
public interface PostService {
	public void draft(); //���
	public void issued(); //ǩ��
	public boolean proofreading(); //У��
	public void archive(); //�鵵
	public boolean postAudit(); //�������
	public Post print(); // ��ӡ
	public void postDistribute(int[] members); //���ķַ�
}