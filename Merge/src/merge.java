
public class merge {

	void merge(double X1[], int left1, int right1, double X2[], int left2,
			int right2, double X[], int left) {

		int i1 = left1;
		int i2 = left2;
		int i = left;
		while (i1 <= right1 && i2 <= right2)
			if (X1[i1] <= X2[i2]) {
				X[i] = X1[i];
				i1++;
				i++;
			} else {
				X[i] = X2[i2];
				i2++;
				i++;
			}
		if (i1 < right1)
			while (i1 <= right1) {
				X[i] = X[i1];
				i1++;
				i++;
			}
		if (i2 < right2)
			while (i2 <= right2) {
				X[i] = X2[i2];
				i2++;
				i++;
			}
	}

}
