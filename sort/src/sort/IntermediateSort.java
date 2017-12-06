package sort;


public class IntermediateSort {
	public static int[] aux;
	public static void exch(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	//Ï£¶ûÅÅĞò
	public static void ShellSort(int[] array)
	{
		int N = array.length;
		if(N == 0 || N == 1) {
			return;
		}
		int h = 0;
		while(h < N/3) {
			h = h*3 +1;
		}
		while(h > 0)
		{
			for(int i = h; i < N;i++)
			{
				for(int j = i; j >= h; j-=h) {
					if(array[j] < array[j-h])
						exch(array, j, j-h);
				}
			}
			h = h/3;
		}
	}
	//ÓĞĞòºÏ²¢
	public static void Merge(int[] array, int lo, int hi)
	{
		int mid = lo + (hi-lo) /2;
		int i = lo;
		int j = mid+1;
		for(int k = lo; k <= hi; k++)
		{
			aux[k] = array[k];
		}
		for(int k = lo; k <= hi; k++)
		{
			if(i > mid) 
				array[k] = aux[j++];
			else if(j > hi)
				array[k] = aux[i++];
			else if(aux[i] <= aux[j])
				array[k] = aux[i++];
			else if(aux[i] > aux[j])
				array[k] = aux[j++];
				
		}
		
	}
    //¹é²¢ÅÅĞòµİ¹é
	public static void MergeSort(int[] array, int lo, int hi)
	{
		if(hi <= lo)	return;
		int mid = lo + (hi - lo) /2;
		MergeSort(array, lo, mid);
		MergeSort(array, mid+1, hi);
		Merge(array, lo, hi);
	}
	
	//¹é²¢ÅÅĞò
	public static void MergeSort(int[] array) {
		int N = array.length;
		if(N == 0 || N == 1) {
			return;
		}
		aux = new int[array.length];
		MergeSort(array, 0, N-1);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,3,2,2,3,5,4,3};
		MergeSort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
