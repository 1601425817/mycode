package sort;

import java.util.Scanner;

public class Main {
	public static boolean isAbcSorted(String[] array)
	{
		boolean res = true;
		int N = array.length;
		for(int i = 0; i < N - 1; i++)
		{
			if(array[i].compareTo(array[i+1]) > 0)
				res = false;
		}
		return res;
	}
	
	public static boolean isLenSorted(String[] array)
	{
		boolean res = true;
		int N = array.length;
		for(int i = 0; i < N - 1; i++)
		{
			if(array[i].length() > array[i+1].length())
				res = false;
		}
		return res;
	}
	
	public static String check(String[] array)
	{
		if(isAbcSorted(array)) {
			if(isLenSorted(array))
				return "both";
			else
				return "lexicographically";
		} else if(isLenSorted(array)) {
			return "lengths";
		} else {
			return "none";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		while(scanner.hasNext())
//		{
//			int n = scanner.nextInt();
//			String[] words = new String[n];
//			for(int i = 0; i < n; i++)
//			{
//				words[i] = new String(scanner.next());
//			}
//			System.out.println(check(words));
//		}
//		scanner.close();
 	}

	
}
