class greeting
{
public synchronized	void sayHello(String name)

{ 	System.out.print("!");
	System.out.print(name);                  //!guru! 
	System.out.println("!");
	System.out.println("-----------------");
	
	}

}
	class greetingThread extends Thread
	{
		String name;
		greeting greeting;
		greetingThread(String name, greeting greeting)
		{
			this.name=name;
			this.greeting=greeting;
			
		}
		public void run()
		{
			greeting.sayHello(this.name);
		}
	}


	class greetingThread1 extends Thread
	{
		String name;
		greeting greeting;
		greetingThread1(String name, greeting greeting)
		{
			this.name=name;
			this.greeting=greeting;
			
		}
		public void run()
		{
			greeting.sayHello(this.name);
		}
	}
	
public class Threaddemo4 {

	public static void main(String[] args) {
	//greeting g= new greeting();
	//g.sayHello("guru");
	
	greeting g1= new greeting();
//	g1.sayHello("moorthy");
	greetingThread gt =new greetingThread("mayoor", g1);
	greetingThread gt1 =new greetingThread("jack", g1);
	gt.start();
	gt1.start();
	
	}

}
