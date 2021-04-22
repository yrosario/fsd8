package jav.linearsearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {3,5,34,66,77,88,99};
		
		binarySearch(66, 0, arr.length, arr);

	}
	
	public static void binarySearch(int target, int start, int end, int arr[]) {
		
		int mid = (start + end) / 2;
		
		while(start <= end) {
			if(target < arr[mid])
				end = mid - 1;
			else if(target > arr[mid])
				start = mid + 1;
			else {
				System.out.println("found " + arr[mid]);
				break;
			}
		}
	}

}
