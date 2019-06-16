package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"yellow", "green", "blue", "red", "cyan"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "hello";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				arr[i] = "yes";
			}else {
				arr[i] = "no";
			}
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println("-----------------------");
		for(int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		//7. make an array of 50 integers
		int[] intArray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int t =0; t < intArray.length; t++) {
			intArray[t] = ((int)(Math.random()*50));
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = intArray[0];
		
		for(int s = 0; s < intArray.length; s++) {
			if(intArray[s]<smallest) {
				smallest = intArray[s];
			}
		}
		System.out.println("-----------------------");
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		System.out.println("-----------------------");
		for(int w = 0; w < intArray.length;w++) {
			System.out.println(intArray[w]);
		}
		//11. print the largest number in the array.
		System.out.println("-----------------------");
		int largest = intArray[0];
		
		for(int l = 0; l < intArray.length; l++) {
			if(intArray[l]>smallest) {
				largest = intArray[l];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println("-----------------------");
		System.out.println(intArray[intArray.length-1]);
		
	}
}
