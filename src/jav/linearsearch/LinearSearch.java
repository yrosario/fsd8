package jav.linearsearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number");
		int choice = scn.nextInt();
		System.out.println();
		
		int arr[] = {30, 45,2,20,34,20,28};
		
		
		for(int i = 0; i < arr.length;i++)
			if(choice == arr[i]) {
				System.out.println(i);
				break;
			}
				
		
	}

}
