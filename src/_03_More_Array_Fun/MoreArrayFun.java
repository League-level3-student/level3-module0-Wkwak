package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] words = {"hello", "bye", "no", "green", "car"};
		MoreArrayFun ar = new MoreArrayFun();
		ar.printRandom(words);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printStrings(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void printReverse(String[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
			
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void printEveryOther(String[] arr) {
		for(int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public void printRandom(String[] arr) {
		Boolean[] usedYet = new Boolean[5];
		for(int i =0; i< usedYet.length; i++) {
			usedYet[i] = false;
		}
		int runs = 0;
		while (runs < arr.length) {
			int randPos = (int)(Math.random()*arr.length);//no repeats
				if(usedYet[randPos] == false){
					System.out.println(arr[randPos]);
					usedYet[randPos]=true;
					runs++;
				}else {
					randPos = (int)(Math.random()*arr.length);
				}
		}
	}
}