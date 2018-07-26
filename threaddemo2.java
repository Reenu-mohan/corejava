class MyThread1 extends Thread 
{
	public void run()
	{
	for(int i=0;i<=20;i++)
		System.out.println(i);
	}
}
class MyThread2 extends Thread 
{
	public void run()
	{
	for(int i=15;i<=20;i++)
		System.out.println(i);
	}
}
public class threaddemo2 {

	public static void main(String[] args) {
		MyThread1 nt=new MyThread1();
		nt.start();
		//nt.start();			not possible to start same thread ,it will give exception :	java.lang.IllegalThreadStateException	
	    //	nt.start();
		System.out.println("break");
		
		
		MyThread2 nt1=new MyThread2();
		nt1.start();
	}

}
