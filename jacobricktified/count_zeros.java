public class zero_count {

	public static void main(String[] args) {
		int[] A= {1, 0, 5, 6, 0, 2};
		
		int result = CountZeros(A);
		System.out.println("The number of zeros is: "  +result);
		
		

	}
    public static int CountZeros(int[] A) {
    	int count=0;
    	int len=A.length;
    	for (int i=0;i<len;i++) {
    		if(A[i]==0) {
    			count=count+1;
    		}
    	}
    	return count;
    }
}
