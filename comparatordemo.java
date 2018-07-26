import java.util.ArrayList;
import java.util.Collections;


class car1 implements Comparable
{
	String color;
	String name;
	double price;
	

	public car1(String color, String name, double price) {
		super();
		this.color = color;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		
		return this.color+" "+this.name+""+this.price ;
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		car1 cc=(car1)o;
		
	int ret=0;
	if(this.price==cc.price)
	ret=0;
	if(this.price<cc.price)
		ret=-1;
		if(this.price>cc.price)
			ret=1;
		return ret;               
		
//		return this.color.compareTo(cc.color);					for order in sake of color
		
		//return this.name.compareTo(cc.name);                  for order in sake of name
	}
	
	
	
}

public class comparatordemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sagar");
		al.add("roobini");
		al.add("jilu");
		al.add("vathsala");
		al.add("athira");
		System.out.println("before ....."+al);
		Collections.sort(al);
		System.out.println("after ....."+al);

		ArrayList a2=new ArrayList();
		
		
		car1 c1=new car1("black","bmw",12569.00);
		car1 c2=new car1("white","innova",2569.00);
		car1 c3=new car1("red","nano",5690.0);
		
		
		a2.add(c1);
		a2.add(c2);
		a2.add(c3);
		Collections.sort(a2);
		System.out.println(a2);

	}

}
