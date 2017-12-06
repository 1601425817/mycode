import java.util.Scanner;

public class MaxProduct {

	private static int findMAX(int[] p, int n) {
		// TODO Auto-generated method stub
		try {
			if(n == 0)
			{				
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����Nֵ����");
		}
		return findMAX(p, 1, n);

	}
	
	private static int findMAX(int[] p, int start, int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return 1;
		int product = 1;
		for(int i = start; i < p.length; i++)
		{
			product = Math.max(product, product*findMAX(p, i, n-1));
		}
		return product;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n+1];
		for(int i = 1; i <= n; i++)
		{
			p[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		int sum = findMAX(p,k);
		System.out.println(sum);
	}

}
