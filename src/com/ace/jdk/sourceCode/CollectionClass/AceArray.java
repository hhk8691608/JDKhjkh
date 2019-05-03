package com.ace.jdk.sourceCode.CollectionClass;

import java.util.Arrays;

/**
 * 	数组
 * @author Administrator
 *
 */
public class AceArray {

	
	public static void main(String[] args) {

//		int[] arr = new int[10];
//		System.out.println(arr.length);
//		arr[0] = 12;
//		System.out.println(arr.length);
	
//		Array ar = new Array();
//		int i = 12;
//		changeValue(i);
//		System.out.println(i);
		
		
//		arraysCopyOfRange();
		systemArrayCopy();
		
	}
	
	/***
	 * System.arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length)
	 * src:源数组；	
	 * srcPos:源数组要复制的起始位置；
	 * dest:目的数组；	
	 * destPos:目的数组放置的起始位置；	
	 * length:复制的长度。
	 */
	private static void systemArrayCopy() {
		int[] arr1 = {3,45,32,42,34,2,1,57,4,3,56,4,65};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 1, arr2, 0, 5);
		  for(int i = 0; i < arr2.length; i++) 
		        System.out.print(arr2[i] + " "); 
		  
	}
	
	/**
	 * copyOfRange(E[] original, int from, int to)
	 * original:原始的数组,默认从0开始
	 * from:原始数组复制的起始位置
	 * to:原始数组复制的结束位置
	 * 	从original数组的下标from开始复制，到下标to结束
	 * [)左闭右开
	 * 
	 */
	private static void arraysCopyOfRange() {
		int[] arr1 = {3,45,32,42,34,2,1,57,4,3,56,4,65};
		int[] arr2 = Arrays.copyOfRange(arr1, 0,8);
		  for(int i = 0; i < arr2.length; i++) 
		        System.out.print(arr2[i] + " "); 
	}
	
	/***
	 * copyOf(E[] original, int newLength)
	 * original:原始的数组,默认从0开始
	 * newLength:新数组的从原始数组复制的长度
	 */
	private static void arraysCopyOf() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, 3);
		int[] arr3 = Arrays.copyOf(arr1, 10);
	    for(int i = 0; i < arr2.length; i++) 
	        System.out.print(arr2[i] + " "); 
	    System.out.println();
	    for(int i = 0; i < arr3.length; i++) 
	        System.out.print(arr3[i] + " ");
	}
	
	
	private static void changeValue(int oldValue) {
		System.out.println("oldValue B: "+oldValue);
		oldValue = 20;
		System.out.println("oldValue A: "+oldValue);
	}
	
	private static void changeValueObject(Integer oldValue) {
		System.out.println("oldValue B: "+oldValue);
		oldValue = 20;
		System.out.println("oldValue A: "+oldValue);
	}
	
	
}
