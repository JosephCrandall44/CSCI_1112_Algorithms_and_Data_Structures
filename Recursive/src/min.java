
public class min {
	double min(double x[], int start, int end){
		if(end==start) //one number to minimize over
			return x[start];
		int mid = (start + end)/2;			//mid-point index
		double min1 = min(x, start, mid); // 1st recursive call
		double min2 = min(x, mid + 1, end);//2nd recursive call
		if(min1 <= min2)
			return min1;
		else
			return min2;
	}

}
