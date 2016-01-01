
public class reverseArray {

	void reverseArray (int A[], i, j){
		if (i <j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		reverseArray(A, i+1, j-1)
		
		
		}
	}
}
