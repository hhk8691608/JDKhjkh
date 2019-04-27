package com.ace.jdk.sourceCode.CollectionClass;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class HashMapSource {
	
	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello world....");
			}
		};

		ExecutorService  pool =  Executors.newSingleThreadExecutor();
		FutureTask ftask = (FutureTask) pool.submit(task);
		
		Executors.newFixedThreadPool(5);
		
	}

}
