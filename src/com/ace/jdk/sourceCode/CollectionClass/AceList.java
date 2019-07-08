package com.ace.jdk.sourceCode.CollectionClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/***
 * 基于JDK1.8
 * 查看ArrayList,
 * @author Administrator
 *
 */
public class AceList {
	
	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList<Integer>();
		
	}
	
	
	
	
	
	/**
	 * 	ArrayList
	 *	 扩容机制采用的算法
	 */
	private static void grow() {
		int oldCapacity = 50;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println("oldCapacity : "+oldCapacity);
		System.out.println("newCapacity : "+newCapacity);
	}

}
