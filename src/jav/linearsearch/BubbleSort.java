package jav.linearsearch;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {43,2,3,99,32,54};
		
		sort(arr);
		
		for(int num : arr)
			System.out.print(num + " ");
	}
	
	public static void sort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
