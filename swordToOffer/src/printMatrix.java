import java.util.ArrayList;

public class printMatrix {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList arrayList = new ArrayList();
	       int rowBegin = 0;
	       int rowEnd = matrix.length - 1;
	       if(rowEnd == -1)
	           return arrayList;
	       int colBegin = 0;
	       int colEnd = matrix[0].length - 1;
	       while(rowBegin <= rowEnd && colBegin <= colEnd)
	       {
	    	   addRound(matrix, arrayList, rowBegin, rowEnd, colBegin, colEnd);
	           rowBegin++;
	           rowEnd--;
	           colBegin++;
	           colEnd--;
	       }
	       return arrayList;
	    }
	    public static void addRound(int [][] matrix, ArrayList a, int rowBegin, int rowEnd,int colBegin, int colEnd)
	    {
	        for(int j = colBegin; j <= colEnd; j++)
	        {
	            a.add(matrix[rowBegin][j]);
	        }
	        for(int i = rowBegin+1; i <= rowEnd; i++)
	        {
	            a.add(matrix[i][colEnd]);
	        }
	        if(rowBegin != rowEnd)
		        for(int j = colEnd-1; j >= colBegin; j--)
		        {
		        	a.add(matrix[rowEnd][j]);
		        }
	        if(colBegin != colEnd)
	         for(int i = rowEnd-1; i > rowBegin; i--)
	        {
	            a.add(matrix[i][colBegin]);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1},{2},{3},{4}};
		ArrayList<Integer> arrayList = printMatrix(array);
		System.out.println(arrayList);

	}

}
