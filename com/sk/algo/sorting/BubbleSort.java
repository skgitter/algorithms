package com.sk.algo.sorting;
import java.util.Arrays;


public class BubbleSort {

	
	public static void main(String[] args) {
		int [] arr = {6,3,9,1,10,7,22,4,8};
		int [] arr1 = {54,26,93,17,77,31,44,55,20};
		
		bubbleSort(arr1);
	}
	
	
	private static int[] bubbleSort(int[] unsortedArr){
		
		int greaterElem = 0;
		int mainLoopIndex = 0;
		int arrLength = unsortedArr.length;
		
		while((mainLoopIndex+1)!=arrLength){
			System.out.println("====================================");
			for(int i = 0;i<(arrLength-mainLoopIndex);i++)
			{
				greaterElem = unsortedArr[i];
				if((i+1)!=arrLength && unsortedArr[i]>unsortedArr[i+1]){
					// swapping
					greaterElem = unsortedArr[i];
					unsortedArr[i] = unsortedArr[i+1];
					unsortedArr[i+1] = greaterElem;
				}
				System.out.println((Arrays.toString(unsortedArr)));
			}
			System.out.println("====================================\n");
			mainLoopIndex++;
		}
		return unsortedArr;
	}

}
