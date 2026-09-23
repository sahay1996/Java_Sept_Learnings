package com.example.folder3;

class Work{
	public synchronized void performWork() {
		
		for (int i = 0; i < 10; i++) {
			if(i%2==0)
			{
				
				System.out.println(i+" , "+Thread.currentThread().getName());
			}
			else {
				System.out.println(i+" , "+Thread.currentThread().getName());
			}
		}
	}
}
class Threading extends Thread
{
	Work work = new Work();
	
	public Threading(Work _work) {
		this.work = _work;
	}
	

	@Override
	public void run() {
		work.performWork();
	}
}


public class ThreadSyncho {

	public static void main(String[] args) {
		Work work1 = new Work();
		Threading threading1 = new Threading(work1);
		threading1.setName("Even Thread");
		threading1.start();
		Threading threading2 = new Threading(work1);
		threading2.setName("Odd Thread");
		threading2.start();
	}

}
