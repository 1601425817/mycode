package sort;

public class HeapSort {
	private int N = 0;
	private int[] heap;
	
	public HeapSort(int length)
	{
		heap = new int[length+1];
	}
	
	public void exch(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public void add(int a) {
		heap[++N] = a;
		swim(N);
	}
	
	public int deleteMax() {
		if(N == 0)
		{
			return 0;
		}
		int max = heap[1];
		heap[0] = 0;
		exch(heap, 1, N);
		N--;
		sink(1);
		return max;
	}
	
	public void swim(int index) {
		while(index > 1)
		{
			if(heap[index] > heap[index/2])
			{
				exch(heap, index, index/2);
			}
			index = index / 2;
		}	
	}
	
	public void sink(int index) {
		int max = 0;
		while(index*2 <= N)
		{
			//找出子节点中最大的节点
			if(index*2 + 1 > N) {
				if (heap[index] < heap[index*2]) {
					max = index * 2;
				}
			} else {
				if(heap[2*index] > heap[2*index+1])
				{
					max = 2 * index;
				} else {
					max = 2 * index +1;
				}
			}
			//毕竟父节点与最大子节点
			if(heap[max] > heap[index]) {
				exch(heap, max, index);
			}
			else {
				break;
			}
			index = max;
		}
	}
	
	public void sort()
	{
		while(N > 1)
		{
			exch(heap, 1, N--);
			sink(1);
		}
		N = heap.length - 1;
	}
	
	public void show()
	{
		for(int i = 1; i <= N; i++)
			System.out.println(heap[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,3,1,24,6,124,113,1,5,6,6,1,6,8,7,2,4,2,63,2,31,1};
		int length = array.length;
		HeapSort heapSort = new HeapSort(length);
		for (int i : array) {
			heapSort.add(i);
		}
		heapSort.sort();
		heapSort.show();
	}

}
