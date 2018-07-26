class numberTread extends Thread
{public void run()												//only write a run method in thread class all other are irrelevent.
	{
	
	
	System.out.println(Thread.currentThread().getName());		//for getting a tread name
	for(int i=0;i<5;i++)																																	//
		System.out.println(i);
	}
	}



public class TreadDemo1 {

	public static void main(String[] args) {
		numberTread nt=new numberTread();
		
	nt.setName("first thread");								// setting a user defined value for thread
		
		nt.start();											// to call the run method of thread
		
		
		
		
		
		
	}

}
