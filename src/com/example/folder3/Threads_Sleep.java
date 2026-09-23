package com.example.folder3;

class Sleep_Delay extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				try {
					System.out.println("Sleeping");
					Thread.sleep(5000);
					System.out.println("Sleep Time over --> Go for work again");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Prints : "+i);
		}
	}
}

public class Threads_Sleep {

	public static void main(String[] args) {
		Sleep_Delay sd1 = new Sleep_Delay();
		sd1.setName("Sleep Delay");
		sd1.start();
	}

}
