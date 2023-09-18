package com.jsp.SearchingAlgorithms;

public class LinearSearch {
	public static int searchElement(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			} 
		}return -1;
	}
	public static void main(String[] args) {
		int arr[]= {4,9,7,8,6,3,2};
		int key=9;
		System.out.println(key+" is present at index "+ searchElement(arr, key));
	}
}
