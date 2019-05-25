/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rizky
 */
public class RunnableSample {
public static void main(String[] args) {
		
		System.out.println("Thread main started");
		
		Thread thread1 = new Thread(new Task1("Thread Runnable"));	
		Thread thread2 = new Thread(new Task2("Thread Only"));	
		thread1.start();
		thread2.start();
		
		System.out.println("Thread main finished");
	}
}

class Task1 implements Runnable {
	private String anyData;
	
	public Task1(String anyData) {
		this.anyData = anyData;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}    
}

class Task2 extends Thread {
	private String anyData;
	
	public Task2(String anyData) {
		this.anyData = anyData;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
