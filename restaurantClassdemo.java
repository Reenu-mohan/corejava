class resturent
{int seatnbr;
String name;

public synchronized void takeLunch(int seatnbr, String name)
{
	System.out.println("welcome");
	System.out.println(name+" booked seat number "+seatnbr);
	
	System.out.println("thank you");
	System.out.println("------------------------------");
	}
}
 class t extends Thread{
	 int seatnbr;
	 resturent resturent;
	 String name;
	 t(int seatnbr, resturent resturent,String name)
	 {
		 this.seatnbr=seatnbr;
		 this.resturent=resturent;
		 this. name=name;
	 }
	 public void run()
		{
			resturent.takeLunch(this.seatnbr,this.name);
		}
	 
 }
 
 
public class restaurantClassdemo {

	public static void main(String[] args) {
		resturent r=new resturent ();
			t t1= new t(12,r,"reenu");
			t t2=new t(10,r,"devika");
			t1.start();
			t2.start();
			

	}

}
