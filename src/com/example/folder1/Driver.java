package com.example.folder1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()--->START");
		Threading1 t1 = new Threading1();
		Thread tA = new Thread(t1);
		tA.start();
		tA.start();
		
	}

}
