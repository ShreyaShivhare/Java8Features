package com.example.demo.interviewQuestions;

//we can implement threads by two ways
//first - by directly extending thread classes. -- when u want to extend the behavior of thread class then go for this.
//Second - by implementing runnable interfaces. --  when u want to provide your thread then go this this.(preferred)

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
	    thread2.start();	
	}

}

