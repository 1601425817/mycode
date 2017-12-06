public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        int oddIndex = 0, evenIndex = 0;//计量奇数和偶数的相对顺序
        int[] index = new int[array.length];
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0)
            {
                index[i] = oddIndex++;
            }else{
                index[i] = evenIndex++;
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0){
                temp[index[i]] = array[i];
            } else{
                temp[index[i]+oddIndex] = array[i];
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            array[i] = temp[i];
        }
    }
    public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		reOrderArray(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}