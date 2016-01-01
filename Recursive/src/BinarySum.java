
public class BinarySum {
	int BinarySUm(intA[], int i, int n){
		if (n ==1) {
			return A[i];
		
		}
		else
			return BinarySum(A, i, n/2) + BinarySum(A, i+2/2 , n);
	}
}
