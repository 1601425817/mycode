package sort;

import java.util.Stack;

public class BasicSort {
	
	public static void exch(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	//—°‘Ò≈≈–Ú
	public static void MySelectSort(int[] array)
	{
		int N = array.length;
		if(N == 0 || N == 1) {
			return;
		}
		for(int i = 0; i < N -1; i++) {
			int min = i;
			for(int j = i+1; j < N; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			exch(array, i, min);
		}
	}
	
	//≤Â»Î≈≈–Ú
	public static void MyInsertSort(int[] array) {
		int N = array.length;
		if(N == 0 || N == 1) {
			return;
		}
		for(int i = 1; i < N ; i++) {
			//œ£∂˚≈≈–Ú÷– π”√≤Â»Î≈≈–Ú
			for(int j = i; j >= 1 ; j--) {
				if(array[j] < array[j-1]) {
					exch(array, j-1, j);
				} else {
					break;
				}
			}
			
		}
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {4,9,7,6,4,5,3,2,6,1,5,20,0,1,5,1,3,6,9,10};
		MySelectSort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
