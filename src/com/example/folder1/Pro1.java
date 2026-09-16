package com.example.folder1;

public class Pro1 {

	public static void main(String[] args) {
		System.out.println("Pro1.main().Start--->Thread Name is : "+Thread.currentThread().getName());
		MyThread thread1 = new MyThread();
		thread1.start();
		System.out.println("Pro1.main().End--->Thread Name is : "+Thread.currentThread().getName());
	}

}
