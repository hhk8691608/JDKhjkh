package com.ace.jdk.sourceCode.CollectionClass;

import java.util.Arrays;

/**
 * 	����
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
	 * src:Դ���飻	
	 * srcPos:Դ����Ҫ���Ƶ���ʼλ�ã�
	 * dest:Ŀ�����飻	
	 * destPos:Ŀ��������õ���ʼλ�ã�	
	 * length:���Ƶĳ��ȡ�
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
	 * original:ԭʼ������,Ĭ�ϴ�0��ʼ
	 * from:ԭʼ���鸴�Ƶ���ʼλ��
	 * to:ԭʼ���鸴�ƵĽ���λ��
	 * 	��original������±�from��ʼ���ƣ����±�to����
	 * [)����ҿ�
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
	 * original:ԭʼ������,Ĭ�ϴ�0��ʼ
	 * newLength:������Ĵ�ԭʼ���鸴�Ƶĳ���
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
