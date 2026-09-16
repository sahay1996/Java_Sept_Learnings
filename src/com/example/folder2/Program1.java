package com.example.folder2;

import java.util.Arrays;
import java.util.List;

class Threds extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=20;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("Even Thread : "+i);
			}
			else {
				if(i==5)
				{
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread : "+i);
			}
		}
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threds t1 = new Threds();
		t1.setName("Even Thread");
		t1.start();
		Threds t2 = new Threds();
		t2.setName("Odd Thread");
		t2.start();
	}

}
