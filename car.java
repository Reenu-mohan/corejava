
public class car {

	String carName;
	double milage;
	double price;
	boolean luxuryType;
	
	public void setCarDetails(String name,double mil,double price,boolean typ)
	{
		this.carName=name;
		this.milage=mil;
		this.price=price;
		this.luxuryType=typ;
		
	}
	
	public void printCarDetails()
	{
		System.out.println("car name= "+carName);
		System.out.println("milage= "+milage);
		System.out.println("price= "+price);
		System.out.println("luxury type"+luxuryType);
		
	}
	public void chooseMyCar()
	{
		if((milage>=10)&&(price<230000))
		{
			System.out.println("my car is "+carName);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c1=new car();
c1. setCarDetails("bnw",456,500000,true);
car c2=new car();
c2. setCarDetails("ford",400,350000,true);
car c3=new car();
c3. setCarDetails("maruthi",200,150000,false);
car c4=new car();
c4. setCarDetails("susuki",320,200000,false);
car c5=new car();
c5. setCarDetails("lambogini",500,700000,true);

// Create a Car array

car carArray[]= {c1,c2,c3,c4,c5};


// Loop through

for (int i=0;i<carArray.length;i++)
{
	carArray[i].printCarDetails();
}

//c1.printCarDetails();
//c2.printCarDetails();
//c3.printCarDetails();
//c4.printCarDetails();
//c5.printCarDetails();

//String obj[]= {"c1","c2","c3","c4","c5"};
//for(String x : obj) {
	//obj[x].chooseMyCar();}
	
for (int i=0;i<carArray.length;i++)
{
	carArray[i].chooseMyCar();
	
}

	}
	

}
