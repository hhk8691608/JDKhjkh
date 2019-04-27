package com.ace.jdk.sourceCode.multithreading.FutureTask;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


/***
 * 

 * @ClassName: FutureTaskThread

 * @Description: TODO
	Future�ӿں�ʵ��Future�ӿڵ�FutureTask�� �����첽����Ľ��
 * @author: admin

 * @date: 2019��4��27�� ����11:30:52
 */
public class FutureTaskThread {
	
	
	
	private final ConcurrentMap<Object, Future<String>> taskCache =
	        new ConcurrentHashMap<Object, Future<String>>();
	private String executionTask(final String taskName) 
	        throws ExecutionException, InterruptedException {
	    while (true) {
	        Future<String> future = taskCache.get(taskName);         // 1.1,2.1
	        if (future == null) {
	            Callable<String> task = new Callable<String>() {
	                public String call() throws InterruptedException {
	                    return taskName;
	                }
	            };                                                                                                // 1.2��������
	            FutureTask<String> futureTask = new FutureTask<String>(task);
	            future = taskCache.putIfAbsent(taskName, futureTask);// 1.3
	            if (future == null) {
	                future = futureTask;
	                futureTask.run();// 1.4ִ������
	            }
	        }
	        try {
	            return future.get();// 1.5,2.2�߳��ڴ˵ȴ�����ִ�����
	        } catch (CancellationException e) {
	                taskCache.remove(taskName, future);
	        }
	    }
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
	
		
	}
	
	
	/**
	 * 
	
	 * @Title: test_futureTask
	
	 * @Description: TODO
		�򵥵�ʹ��futreTask ��api
		
	 * @throws InterruptedException
	 * @throws ExecutionException
	
	 * @return: void
	 */
	private void test_futureTask() throws InterruptedException, ExecutionException {
	Callable<Integer> futureTask = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				
				System.out.println("���㿪ʼ");
				int i = new Random().nextInt(1000) ;
				System.out.println("���������i="+i);
				return i;
			}
		};
		ExecutorService pool =  Executors.newCachedThreadPool();
		FutureTask<Integer> result = (FutureTask<Integer>) pool.submit(futureTask);
		
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
		
		System.out.println("���߳���ִ������");
		Integer i =  result.get();
		System.out.println("���ս����:i="+i );
		System.out.println("��������ִ�����");
	}
	
	
	
	
	
	
	

}
