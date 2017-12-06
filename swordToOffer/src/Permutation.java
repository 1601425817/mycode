import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Permutation {
	
//	public static ArrayList<String> PermutationList(String str)
//	{
//		ArrayList<String> arrayList = new ArrayList<String>();
//		if(str == null || str.length() == 0)
//			return arrayList;
//		char[] array = str.toCharArray();
//		PermutationList(arrayList, array, 0);
//		arrayList.sort(null);
//		return arrayList;
//	}
//	
//	public static void PermutationList(ArrayList<String> results, char[] array, int begin)
//	{	
//		int length = array.length;
//		if(!results.contains(String.valueOf(array)))
//			results.add(String.valueOf(array));
//		for(int i = begin; i < length; i++)
//		{
//			exch(array, begin, i);
//			PermutationList(results, array, begin + 1);
//			exch(array, begin, i);
//		}
//		
//	}
//	
//	public static void exch(char[] str, int a, int b)
//	{
//		if(a < 0 || a >= str.length || b < 0 || b >= str.length)
//			return;
//		char temp = str[a];
//		str[a] = str[b];
//		str[b] = temp;
//	}
	public static ArrayList<String> PermutationList(String str)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		if(str == null || str.length() == 0)
			return arrayList;
		char[] array = str.toCharArray();
		Arrays.sort(array);
		PermutationList(arrayList, array);
		return arrayList;
	}
	
	public static void PermutationList(ArrayList<String> results, char[] array)
	{	
//		【例】 一般而言，设P是[1,n]的一个全排列。
//	　　　　　　P=P1P2…Pn=P1P2…Pj-1PjPj+1…Pk-1PkPk+1…Pn
//	　　　　find:　　j=max{i|Pi<Pi+1}
//	　　　　　　　　　k=max{i|Pi>Pj}
//	　　　　　　1，  对换Pj，Pk，
//	　　　　　　2，  将Pj+1…Pk-1PjPk+1…Pn翻转
//	          P’= P1P2…Pj-1PkPn…Pk+1PjPk-1…Pj+1即P的下一个
		int length = array.length;
		if(length == 1)
		{
			results.add(String.valueOf(array));
			return;
		}
		int j = length - 2;
		int k = 0;
		while(true)
		{
			results.add(String.valueOf(array));
			while(array[j] >= array[j+1] && j >= 0) {
				j--;
				if(j==-1)
				{
					break;
				}
			};
			if(j == -1)
			{
				break;
			}
			char max = 'a' -1;
			for(int i = j + 1; i < length; i++)
			{
				if(array[i] > array[j]) {
					max = array[i];
					k = i;
				}
			}
			exch(array, j, k);
			reverse(array, j+1);
			System.out.println("j"+j+"k"+k+"arrya "+String.valueOf(array));
			j = length - 2;
		}
		
	}
	
	public static void exch(char[] str, int a, int b)
	{
		if(a < 0 || a >= str.length || b < 0 || b >= str.length)
			return;
		char temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}
	
	public static void reverse(char[] str, int begin)
	{
		int end = str.length - 1;
		int count = end - begin;
		for(int i = 0; i <= count/2; i++)
		{
			exch(str, begin+i, end-i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= (int) System.currentTimeMillis();
		String str = "abb";
		ArrayList<String> strs = PermutationList(str);
		Iterator<String> it = strs.iterator();
		while(it.hasNext())
		{
			String string = it.next();
			System.out.println(string);
		}
		int b= (int) System.currentTimeMillis();
		System.out.println(b-a);
	}

}
