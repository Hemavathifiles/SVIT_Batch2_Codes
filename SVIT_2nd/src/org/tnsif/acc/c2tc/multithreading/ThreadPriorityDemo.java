package org.tnsif.acc.c2tc.multithreading;

class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id "+" "+Thread.currentThread().getId());
	}
}

class OneNote extends Thread
{
	public void run()
	{
		System.out.println("OneNote id "+" "+Thread.currentThread().getId());
	}
}
class Chrome extends Thread
{
	public void run()
	{
		System.out.println("Chrome id "+" "+Thread.currentThread().getId());
	}
}


public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Eclipse eclipse=new Eclipse();
		eclipse.start();
		eclipse.setPriority(5);
		Chrome chrome=new Chrome();
		chrome.start();
		chrome.setPriority(10);
		OneNote onenote=new OneNote();
		onenote.start();
		onenote.setPriority(1);

	}

}
