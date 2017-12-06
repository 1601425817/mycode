
public class TestVerifySquenceOfBST {
	public static boolean VerifySquenceOfBST(int [] sequence, int start, int end){
        if(start >= end)
   			return true;
        int root = sequence[end];
        int i = start;
        int j = start;
      	while(root > sequence[i] && i < end){
            i++;
        }
        for(j = i+1; j < end; j++)
        {
            if(sequence[j] < root) {
            	return false;
            }      
        }
        return VerifySquenceOfBST(sequence, start, i-1)&&VerifySquenceOfBST(sequence, i, end-1);
        
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        boolean result = true;
        result = VerifySquenceOfBST(sequence, 0, sequence.length - 1);
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};
		System.out.println(VerifySquenceOfBST(a));
	}

}
