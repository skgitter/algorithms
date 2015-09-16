package com.sk.algo.sorting;
import java.util.Arrays;


public class ShellSort {

	public static void main(String[] args) {
		shellSort();
	}
	
	private static void shellSort(){
		
		int []unsortedArr = {54,26,93,17,77,31,44,55,20};
		
		int arrLength = unsortedArr.length;
		//int gap[]  = {1391376, 463792, 198768, 86961, 33936, 13776, 4592, 1968, 861, 336, 112, 48, 21, 7, 3, 1};
		int gap  = arrLength / 2;
		int currentValue=0;
	
		for(int i=gap;i>0;i=i/2){
			int currentGap = i;
			System.out.println("current gap ::"+currentGap);
			System.out.println("====================================");
			for(int currentPosition=currentGap; currentPosition<arrLength; 
					currentPosition = currentPosition+currentGap){
				currentValue = unsortedArr[currentPosition];
				
				while( (currentPosition >= currentGap) && ( unsortedArr[currentPosition-currentGap] > currentValue) ){
					unsortedArr[currentPosition] = unsortedArr[currentPosition-currentGap];
					currentPosition = currentPosition - currentGap;
				}
				
				unsortedArr[currentPosition] = currentValue;
				System.out.println(Arrays.toString(unsortedArr));
			}
		}
	}
	
	// to
	private static int getGap(int length,int kthvalue){
		int gap=0;
		gap = (length/2^kthvalue);
		return gap;
	}
}
