package com.threads;

public class DeadlockExample {
	public static void main(String args[]) {
		String resource1 = "krish paine";
		String resource2 = "Painuly";
		Thread t1= new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("thread 1: locked resource 1");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
					}
				}
				synchronized (resource2) {
					System.out.println("thread 1: locked resource 2");					
				}
			}
		};
		Thread t2= new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("thread 2: locked resource 2");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
					}
				}
				synchronized (resource1) {
					System.out.println("thread 2: locked resource 1");					
				}
			}
		};
		t1.start();
		t2.start();
	}
}
