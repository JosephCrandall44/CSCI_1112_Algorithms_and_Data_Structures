
public class insertionSort {
void insertionSort(int List[]){
	int temp;
	int size = List.length;
	
	for (int i = 1 ; i < size; i++){
		int j = i;
		temp = List[i];
		while(j > 0 && temp < List[j-1]){
			List[j] = List[j-1]; // right shifted
			j--;		
		}
		List[j] = temp;
	}
}
}
