package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

	private void processmessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

public class ThreadPoolExample {
	public static void main(String args[]) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i = 0 ; i< 10; i++) {
            Runnable obj = new WorkerThread("" + i);
            executorService.execute(obj);
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {
//			System.out.println("not terminated");
		}
        System.out.println("********All threads are Finished********");
	}
}
