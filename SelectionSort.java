package entities;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[15];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("########## BEFORE ############");
		System.out.println(Arrays.toString(numbers));
		
		selectionSort(numbers);
		
		System.out.println("########## AFTER ############");
		System.out.println(Arrays.toString(numbers));
	}

	private static void selectionSort(int[] numbers) {
		for (int i=0;i < numbers.length - 1; i++) {
			int min = numbers[i];
			int indexMin = i;
			
			for (int j = i+1; j<numbers.length;j++) {
				if (numbers[j] < min) {
					min = numbers[j];
					indexMin = j;
				}
			}
			
		swap(numbers, i, indexMin);
		
	}

}

	private static void swap(int[] numbers, int i, int indexMin) {
		int temp = numbers[i];
		numbers[i] =numbers[indexMin];
		numbers[indexMin] = temp;
		
	}
}
