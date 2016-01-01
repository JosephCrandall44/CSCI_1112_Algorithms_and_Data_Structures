
public class MergeSort {
	
	void mergeSort(double X[], double Y[], int left, int right){
		if(left == right){Y[left] = X[left]; return;}
		int mid = ( left + right)/2;
		
		double Z[right + 1];//declare an array Z of type double and size right + 1
		
		//next, sort left half of X and put the result in left half of Z
		mergeSort(X, Z , left , mid);
		
		//next, sort right half of X and put the result in right half of Z
		mergeSort(X , Z , mid+1 , right);
		
		//next, merge the two halves of Z and put result in Y
		merge(Z ,left , mid , Z , mid+1 , right , Y , left);
		}
	
	void merge(double X1[], int left1, int right1, double X2[], int left2, int right2, double X[], int left)
	{
		int i1 = left1; //head X1
		int i2 = left2; //head X2
		int i = left; //head X3
		while(i1 <= right1 && i2 <= right2);
			if(X1[i1]<=X2[i2]){
				X[i]=X1[i1];
				i1++;
				i++;
			}else{
				X[i] = X2[i2];
			}
			if(i1<right1)//copy leftovers of X1 to end of X
				while(i1 <= right1){
					X[i] = X1[i1];
					i1++; 
					i++;
					}
			if (i2<right2)//copy leftovers of X2 to the end of X
				while(i2 <= right2){
					X[i] = X[i2]; i2++; i++;}
		
	}
	
}
