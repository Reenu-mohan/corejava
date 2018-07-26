class MyThread3 implements Runnable
{
	public void run()
	{
	for(int i=0;i<=20;i++)
		System.out.println(i);
	}
}
class MyThread4 implements Runnable
{
	public void run()
	{
	for(int i=15;i<=20;i++)
		System.out.println(i);
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t=new Thread(new MyThread3());
		t.start();
		
		System.out.println("break");
		
		
		Thread t1=new Thread(new MyThread4());
		t1.start();

	}

}      
