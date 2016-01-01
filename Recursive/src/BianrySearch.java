
public class BianrySearch {
	int BinarySearch(int key, int A[], int LI, int HI )
	{
		int mid = (HI + LI) /2;
		if (LI > HI){
			return -1;
		}
		if (key == A[mid]){
			return mid;
		}
		else if (key < A[mid]){
			BinarySearch(key, A, LI, mid -1);
		}
		else{
			BinarySearch(key, A, mid + 1, HI);
		}
	}
}
