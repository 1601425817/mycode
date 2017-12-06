package sort;

public class QuickSort {
	
	public static void exch(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static int findPivot(int[] array, int lo, int hi)
	{
		int mid = (lo + hi) / 2;
		if(array[lo] > array[mid])
			exch(array, lo, mid);
		if(array[lo] > array[hi])
			exch(array, lo, hi);
		if(array[mid] > array[hi])
			exch(array, mid, hi);
		exch(array, lo, mid);
		return array[lo];
	}
	
	public static void quickSort(int[] array, int lo, int hi)
	{
		if(lo == hi)
			return;
		int i = lo;
		int j = hi + 1;
		int value = findPivot(array, lo, hi);
		while(true)
		{
			//从右往左找到一个比value小的值
			while(array[--j] > value);
			//从左往右找到一个比value大的值
			while(array[++i] < value);
			//如果i与j相遇，或者i与j交错，则停止
			if(i >= j)	break;
			exch(array, i, j);
			
		}
		exch(array, lo, j);
		if(j > lo)
			quickSort(array, lo, j-1);
		if(j < hi)
			quickSort(array, j+1, hi);
	}
	
	public static void quickSort(int[] array)
	{
		int N = array.length;
		if(N == 0 || N == 1)
			return;
		quickSort(array, 0, N-1);
	}
	public static void main(String[] args) {
		int []array = {1,3,1,24,6,124,113,1,5,6,6,1,6,8,7,2,4,2,63,2,31,1};
		quickSort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
