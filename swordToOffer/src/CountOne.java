
public class CountOne {

	public static int count(int n)
	{
		int count = 0;
		for(int i = 1; i <= n; i *= 10)
		{
			int a = n / i;
			int b = n % i;
			count = count + (a+8)/10*i;
			if(a %10 == 1)
			{
				count = count + b + 1;
			}
			System.out.println("a "+a+"b "+b+"count "+count);
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(132));
	}

}
